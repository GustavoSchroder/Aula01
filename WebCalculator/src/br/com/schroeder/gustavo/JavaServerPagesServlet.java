package br.com.schroeder.gustavo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/action/jsp")
public class JavaServerPagesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/retorno.jsp");
		rd.include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double response;
		String var1 = req.getParameter("var1");
		String var2 = req.getParameter("var2");

		String operacao = req.getParameter("operacao");

		try {

			if (operacao.equalsIgnoreCase("*")) {
				response = Double.parseDouble(var1) * Double.parseDouble(var2);
			} else if (operacao.equalsIgnoreCase("/")) {
				response = Double.parseDouble(var1) / Double.parseDouble(var2);
			} else if (operacao.equalsIgnoreCase("-")) {
				response = Double.parseDouble(var1) - Double.parseDouble(var2);
			} else if (operacao.equalsIgnoreCase("+")) {
				response = Double.parseDouble(var1) + Double.parseDouble(var2);
			} else {
				response = Math.pow(Double.parseDouble(var1), Double.parseDouble(var2));
			}

		} catch (Exception e) {
			String result = "Os Pães não puderam ser calculados, caso persistir dúvidas entrar em contato com fabiano";
			req.setAttribute("result", result);

			RequestDispatcher rd = req.getRequestDispatcher("/Calculator.jsp");
			rd.include(req, resp);
			return;

		}
		escrever("", var1 + " " + operacao + " " + var2 + " = " + response.toString());
		req.setAttribute("result", response.toString());
		RequestDispatcher rd = req.getRequestDispatcher("/Calculator.jsp");
		rd.include(req, resp);
	}
	
	public void escrever(String log, String value) {

		try {
			String arq = "C:\\Gustavo Lazarotto Schroeder\\Workspace\\WebCalculator\\WEB\\";
			
			arq += "saida.txt";

			FileWriter arquivo = new FileWriter(arq, true);
			BufferedWriter buffer = new BufferedWriter(arquivo);
			log += value;
			buffer.append(log);
			buffer.newLine();

			buffer.close();

			System.out.println("Arquivo gravado com sucesso!");

		} catch (IOException e) {
		}

	}

}
