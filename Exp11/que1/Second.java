package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Second extends HttpServlet {
protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter obj=res.getWriter();
	String values[]=req.getParameterValues("num1");   //array is used to get multiple values
	int addition=0;
	for(int i=0;i<values.length;i++)
	{
		addition=addition+Integer.parseInt(values[i]);	
	}
	obj.println("addition is: "+addition);
	obj.print("organization name: ");
	ServletContext ctx=getServletContext(); //object of ServletContext
	String str=ctx.getInitParameter("name");
	obj.println(str);
	obj.print("Author's name: ");
	String str1=ctx.getInitParameter("authorname");
	obj.println(str1);
	}
}
