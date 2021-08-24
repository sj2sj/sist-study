package com.iu.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iu.s1.bankbook.BankBookController;
import com.iu.s1.member.MemberController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private MemberController memberController;
	private BankBookController bankBookController;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
        
        memberController = new MemberController();
        bankBookController = new BankBookController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("FrontController");
		
		String uri = request.getRequestURI();
//		String url = request.getRequestURL().toString();
		
		String path = "";
		
		int startindex = request.getContextPath().toString().length();
		int lastIndex = uri.lastIndexOf("/");
		
		path = uri.substring(startindex+1, lastIndex).toLowerCase();
		System.out.println("path:" + path);
		
		if ("member".equals(path)) {
			memberController.start(request);
		} else if ("bankbook".equals(path)) {
			bankBookController.start(request, response);
		} else {
			System.out.println("존재하지 않는 url");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
