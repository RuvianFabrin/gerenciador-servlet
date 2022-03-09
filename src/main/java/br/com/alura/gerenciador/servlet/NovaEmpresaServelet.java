package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NovaEmpresaServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nomeEmp = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmp);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		RequestDispatcher rq =  request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rq.forward(request, response);
	}

}
