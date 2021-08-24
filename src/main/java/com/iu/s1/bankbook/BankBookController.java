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
			
		} else if ("bankbookinsert.do".equals(path)) {
			System.out.println("상품 등록");
		} else if ("bankbookselect.do".equals(path)) { //------------------------------------------------bankbookSelect
			System.out.println("상품상세조회");
			
			String value = request.getParameter("bookNumber");
			long value2 = Long.parseLong(value);
			
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNumber(value2);
			bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
			
			System.out.println(bankBookDTO.getBookName());
			
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
