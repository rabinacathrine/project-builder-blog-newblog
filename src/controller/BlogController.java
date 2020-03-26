package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;

import model.User;


@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object user;
       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blogDetails = request.getParameter("selectedAnswers");
		String arr[]=blogDetails.split(",");
		String title=arr[0];
		String description=arr[1];
		LocalDate postedOn= LocalDate.now(); 
		Blog blog=new Blog(title,description,postedOn);
		blog.setTitle(title);
		//blog.setDescription(description);
		blog.setDescription(description);
		blog.setPostedon(postedOn);
		System.out.println("Blog Title: "+blog.getTitle());
		System.out.println("Blog Description: "+blog.getDescription());
		System.out.println("Posted on: "+blog.getPostedon());
		
		

		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			//request.setAttribute("User",User);
			request.setAttribute("user", user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
	
	}

}
