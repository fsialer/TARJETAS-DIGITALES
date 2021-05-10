package com.tarjeta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancomaya.clientes.TarjetaDigital;
import com.bancomaya.clientes.TarjetaDigitalService;
import com.bancomaya.clientes.TarjetaDigitalServiceImplService;

@WebServlet(urlPatterns="/addTarjeta")
public class TarjetaServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String banco=req.getParameter("banco");
		String cliente=req.getParameter("cliente");
		String numero=req.getParameter("numero");
		String fechaVencimiento=req.getParameter("fechaVencimiento");
		
		System.out.println("banco: "+banco);
		System.out.println("cliente: "+cliente);
		System.out.println("numero: "+numero);
		System.out.println("fechaVencimiento: "+fechaVencimiento);
		
		TarjetaDigitalService tarjetaCliente=new TarjetaDigitalServiceImplService().getTarjetaDigitalServiceImplPort();
		
		TarjetaDigital tarjeta=new TarjetaDigital();
		tarjeta.setBanco(banco);
		tarjeta.setCliente(cliente);
		tarjeta.setNumero(numero);
		tarjeta.setFechaVencimiento(fechaVencimiento);
		
		tarjetaCliente.crearTarjetaDigital(tarjeta);
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		
		//super.service(req, resp);
	}
}
