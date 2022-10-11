package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Exercicio2", urlPatterns = "/exercicio2.do")
public class Exercicio2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if (login == null || senha == null) {
            writer.println("<h1>Insira um login e senha na url.</h1>");
        }
        else if (login.equals("admin") && senha.equals("password")) {
            writer.println("<h1>Bem vindo, usuário " + login + ".</h1>");
        } else {
            writer.println("<h1>Olá Login e/ou senha inválidos</h1>");
        }
    }
}
