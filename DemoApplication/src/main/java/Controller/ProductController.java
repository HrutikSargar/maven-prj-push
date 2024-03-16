package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Product;
@WebServlet("/AddPoduct")
public class ProductController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pName=req.getParameter("productName");
		Double pPrice=Double.parseDouble(req.getParameter("productPrice"));
		String pCategory=req.getParameter("productCategory");
		int pQty= Integer.parseInt(req.getParameter("productQty"));
		
		Product p1=new Product();
		
		p1.setProductName(pName);
		p1.setProductCaategory(pCategory);
		p1.setProductPrice(pQty);
		p1.setProductQty(pQty);
		
		Session session =new Configuration().configure("/hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory().openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(p1);
		transaction.commit();
		session.close();
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.html");
		PrintWriter printWriter =resp.getWriter();
		resp.setContentType("text/html");
		printWriter.print("<h2>DATA INSERTDDE SUCCESSFULLY</h2>");
		requestDispatcher.include(req, resp);
//		requestDispatcher.forward(req, resp);
		
		
	}

}
