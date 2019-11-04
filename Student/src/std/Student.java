package std;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Student() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		PrintWriter pw= response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String mob=request.getParameter("mob");
		String address=request.getParameter("address");
		pw.print("id"+id);
		
		
	}

	
	

}
