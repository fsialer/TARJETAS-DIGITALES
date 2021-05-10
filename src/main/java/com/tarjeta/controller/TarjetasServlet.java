package com.tarjeta.controller;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancomaya.clientes.TarjetaDigital;
import com.bancomaya.clientes.TarjetaDigitalService;
import com.bancomaya.clientes.TarjetaDigitalServiceImplService;

@WebServlet(urlPatterns = "/obtenerTarjetasDigitales")
public class TarjetasServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = resp.getWriter();
		TarjetaDigitalService tarjetaCliente=new TarjetaDigitalServiceImplService().getTarjetaDigitalServiceImplPort();
		List<TarjetaDigital> tarjetas=tarjetaCliente.obtenerTarjetaDigitales();
		//req.setAttribute("tarjetasDigitales", tarjetas);
		
	
		out.println("<table>");
		out.println("<tr>");
		out.println("<td > BANCO </td>");			
		out.println("<td >CLIENTE</td>");
		out.println("<td >NUMERO</td>");
		out.println("<td >NUMERO</td>");
		out.println("</tr>");
		for(TarjetaDigital tarjeta:tarjetas) {
			out.println("<tr>");
			out.println("<td >"+tarjeta.getBanco()+"</td>");
			out.println("<td >"+tarjeta.getCliente()+"</td>");
			out.println("<td >"+tarjeta.getNumero()+"</td>");
			out.println("<td >"+tarjeta.getFechaVencimiento()+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");

		//req.getRequestDispatcher("/index.jsp").forward(req, resp);
		//super.service(req, resp);
	}
}
