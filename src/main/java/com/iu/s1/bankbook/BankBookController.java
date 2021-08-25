package com.iu.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankBookController {
	private BankBookDAO bankBookDAO;
	
	public BankBookController() {
		bankBookDAO = new BankBookDAO();
	}

	
	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BankBook Controller 실행!");
		
		String uri = request.getRequestURI();
		
		int startIndex = uri.lastIndexOf("/");
//		int lastIndex = uri.lastIndexOf(".");
		int lastIndex = uri.length();
		
		String path = uri.substring(startIndex+1, lastIndex).toLowerCase();
		System.out.println("path:"+path);
		
		if ("bankbooklist.do".equals(path)) { //------------------------------------------------bankbookList
			System.out.println("상품 목록");
			
			ArrayList<BankBookDTO> bankBookDTOs = bankBookDAO.getList();
			
//			for (int i = 0; i < bankBookDTOs.size(); i++) {
//				System.out.println(bankBookDTOs.get(i).getBookNumber());
//				System.out.println(bankBookDTOs.get(i).getBookName());
//				System.out.println(bankBookDTOs.get(i).getBookRete());
//				System.out.println(bankBookDTOs.get(i).getBookSale());
//			}
			
			for (BankBookDTO dto : bankBookDTOs) {
				System.out.println(dto.getBookNumber());
				System.out.println(dto.getBookName());
				System.out.println(dto.getBookRete());
				System.out.println(dto.getBookSale());
			}
			
			request.setAttribute("dtos", bankBookDTOs);
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookList.jsp");
			try {
				view.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if ("bankbookinsert.do".equals(path)) { //------------------------------------------------bankbookInsert
			System.out.println("상품 등록");
			
			
			String method = request.getMethod();
			System.out.println("Method: " + method);
			
			//주소가 POST로 넘어오면 (form으로 데이터 받아오면)
			if (method.equals("POST")) {
				System.out.println("insert2");
				
				System.out.println("bookName: " + request.getParameter("bookName"));
				System.out.println("bookRate: " + request.getParameter("bookRate"));
				System.out.println("bookSale: " + request.getParameter("bookSale"));
				
				String bookName = request.getParameter("bookName");
				double bookRate = Double.parseDouble(request.getParameter("bookRate"));
				int bookSale = Integer.parseInt(request.getParameter("bookSale"));

				
				BankBookDTO dto = new BankBookDTO();
				dto.setBookName(bookName);
				dto.setBookRete(bookRate);
				dto.setBookSale(bookSale);
				
				//Table에 insert
				int result = bankBookDAO.setInsert(dto);
				
				if (result != 0) {
					System.out.println("처리되었다.");
				} else {
					System.out.println("처리되지 않았다.");
				}
				
				
				//bankbookList로 보내주기 위해선 bankbookList에 필요한 정보(ArrayList<BankBookDTO)를 보내줘야함!!!
//				ArrayList<BankBookDTO> bankBookDTOs = bankBookDAO.getList();
//				request.setAttribute("dtos", bankBookDTOs);
				try {
					response.sendRedirect("./bankBookList.do");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			} else { //주소가 GET으로 넘어오면 (form)
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookInsert.jsp");
				try {
					view.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		} 
		else if ("bankbookselect.do".equals(path)) { //------------------------------------------------bankbookSelect
			System.out.println("상품상세조회");
			
			String value = request.getParameter("bookNumber");
			long value2 = Long.parseLong(value);
			
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNumber(value2);
			bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
			
			System.out.println(bankBookDTO.getBookName());
			
			request.setAttribute("dto", bankBookDTO);
			
			//매개변수: 내가 보여주고 싶은 jsp 경로명
			//주소: 웹브라우저 주소 기준.
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookSelect.jsp");
			try {
				view.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("그 외 나머지");
		}
		
	}
}
