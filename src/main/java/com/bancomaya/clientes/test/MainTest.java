package com.bancomaya.clientes.test;

import java.util.List;

import com.bancomaya.clientes.TarjetaDigital;
import com.bancomaya.clientes.TarjetaDigitalService;
import com.bancomaya.clientes.TarjetaDigitalServiceImplService;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaDigitalService tarjetaCliente=new TarjetaDigitalServiceImplService().getTarjetaDigitalServiceImplPort();
		
		List<TarjetaDigital> clientes= tarjetaCliente.obtenerTarjetaDigitales();
		
		for(TarjetaDigital tarjeta:clientes) {
			System.out.println("==================");
			System.out.println(tarjeta.getBanco());
			System.out.println(tarjeta.getCliente());
			System.out.println(tarjeta.getNumero());
			System.out.println(tarjeta.getFechaVencimiento());
			System.out.println("==================");
		}
		

	}

}
