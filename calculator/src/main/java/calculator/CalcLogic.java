package calculator;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcLogic
 *
 */
@WebServlet("/calc")
public class CalcLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcLogic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String view = "/WEB-INF/views/calc.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		  dispatcher.forward(request, response);
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String total = String.valueOf(request.getParameter("total"));

		
		if (total.contains("/")){
		int iwaru = total.indexOf("*");
		String num1 = total.substring(0,iwaru);
		String num2 = total.substring(iwaru+2);
		int numm1 = Integer.parseInt(num1);
		int numm2 = Integer.parseInt(num2);
		int waru = numm1 + numm2;
		           total = "割り算";
		           request.setAttribute("waru", waru);
		       }else if(total.contains("*")){
		       	int ikake = total.indexOf("*");
		String num1 = total.substring(0,ikake);
		String num2 = total.substring(ikake+2);
		int numm1 = Integer.parseInt(num1);
		int numm2 = Integer.parseInt(num2);
		int waru = numm1 * numm2;
		request.setAttribute("waru", waru);
		           total = "掛け算";
		       }else if(total.contains("+")){
		   
		       	int ikake = total.indexOf("+");
		String num1 = total.substring(0,ikake);
		String num2 = total.substring(ikake+2);
		int numm1 = Integer.parseInt(num1);
		int numm2 = Integer.parseInt(num2);
		int waru = numm1 + numm2;
		request.setAttribute("waru", waru);
		           total = "足し算";
		       }else if(total.contains("-")){
		
		       	int ikake = total.indexOf("-");
		String num1 = total.substring(0,ikake);
		String num2 = total.substring(ikake+2);
		int numm1 = Integer.parseInt(num1);
		int numm2 = Integer.parseInt(num2);
		int waru = numm1 - numm2;
		request.setAttribute("waru", waru);
		           total = "引き算";
		       }else {
		       	total = "0";
		       }
		
		
		 request.setAttribute("total", total);

		doGet(request, response);
	}

}
