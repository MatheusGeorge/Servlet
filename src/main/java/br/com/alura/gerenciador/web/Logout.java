package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/logout")
public class Logout implements Tarefa{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}

		// direciona o cliete pelo lado dele, não é o recomendado se queremos esconder alguma pagina html
		//resp.sendRedirect("logout.html");
		

		/* outro modo, desloga ele e tiro tudo da sessão
		 req.getSession().Invalidate();
		 com cookie
		Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
		PrintWriter writer = resp.getWriter();
		if(cookie == null){
			writer.println("<html><body> Usuário ja estava logado! </body></html>");
			return; 
		}
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
	}*/
	
	
}
