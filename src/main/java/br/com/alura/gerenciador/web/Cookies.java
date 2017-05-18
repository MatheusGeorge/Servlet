package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

public class Cookies {

	private final Cookie[] cookies;

	public Cookies(Cookie[] cookies) {
		this.cookies = cookies;
	}

	public Cookie buscaUsuarioLogado() {
		if(cookies == null) return null;
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("usuario.logado")){
				// para deixar com mais 10min a cada nova requisição
				//cookie.setMaxAge(10 * 60);
				//resp.addCookie(cookie);
				return cookie;
			}
		}
		return null;
	}
}
