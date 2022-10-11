package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Exercicio3Form", urlPatterns = "/formulario.do")
public class Exercicio3Form extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String nome = req.getParameter("nome");
        String disciplina = req.getParameter("disciplina");
        String primeiranota = req.getParameter("nota1");
        String segundanota = req.getParameter("nota2");
        String terceiranota = req.getParameter("nota3");
        String quartanota = req.getParameter("nota4");

        double nota1 = Double.parseDouble(primeiranota);
        double nota2 = Double.parseDouble(segundanota);
        double nota3 = Double.parseDouble(terceiranota);
        double nota4 = Double.parseDouble(quartanota);

        double media = (nota1+nota2+nota3+nota4)/4;


        writer.println("<h2>Olá aluno(a) "+nome+ " suas notas são nota 1 = " +nota1+ ", nota 2 = " + nota2 + ", nota 3 = "+ nota3 +", nota 4 = "+ nota4 +" e sua média na disciplina "+ disciplina + " foi " + media +"</h2>");

        if (media > 7){
            writer.println("<h2>Aprovado</h2>");
        } else if ((media >= 6) && (media <=6.9)) {
            writer.println("<h2>Recuperação</h2>");
        } else {
            writer.println("<h2>Reprovado</h2>");
        }


    }
}