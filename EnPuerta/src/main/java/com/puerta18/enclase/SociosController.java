package com.puerta18.enclase;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SociosController {

	@Autowired
	private Environment env;

	// landing page, muestra un formulario de busqueda 
	// y tambien muestra los resultados con un parametro no requerido 
	@GetMapping("/")
	public String landing() {
		String pepe = "fecha";
		
		pepe = "lkasjdlaskd";
		return ""; // TODO: Armar template
	}
	
	@GetMapping("/socios/nuevo") // formulario de alta vacio
	public String nuevo() {
		return "";
	}
	
	@GetMapping("/socios/nuevo/procesar") // inserta nuevos socios
	public String insertarNuevo() {
		return "";
	}
	
	@GetMapping("/socios/checkin/{id}") // 
	public String checkIn() {
		return "";
	}
	
	@GetMapping("/socios/checkout/{id}") // 
	public String checkOut() {
		//dni=dni.replaceAll("\\.", ""); 
		return "";
	}
	
	// estas rutas mas adelante vamos a protegerlas con usuario y contraseña
	// @GetMapping("/socios/mostrar/{id}") // muestra el detalle completo de un socio
	// @GetMapping("/socios/listado")      // muestra el listado completo sin paginacion, por ahora
	
	// @GetMapping("/socios/modificar/{id}")
	// @GetMapping("/socios/modificar/procesar/{id}")
}
