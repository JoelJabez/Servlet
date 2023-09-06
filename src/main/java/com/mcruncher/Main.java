package com.mcruncher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

@WebServlet("/username")
public class Main extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("username");

		printToScreen(resp, name);
	}

	void printToScreen(HttpServletResponse resp, String name) throws IOException {
		PrintWriter printWriter = resp.getWriter();

		printWriter.println("<html lang=\"en\">");
		printWriter.println("<body>");
		printWriter.printf("<h2>Hello %s</h2>", name);
		printWriter.println("</body>");
		printWriter.println("</html>");

		printWriter.close();
	}
}