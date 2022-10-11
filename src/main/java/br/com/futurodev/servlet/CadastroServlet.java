
package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Cadastro Servlet", urlPatterns = "/cadastro.do")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        String nome = req.getParameter("nome");
        String cidade = req.getParameter("cidade");
        String idade = req.getParameter("idade");

        writer.println("<h1>Olá " + nome + ", você tem " + idade + " anos e mora na cidade de " + cidade + ".</h1>");


    }
}