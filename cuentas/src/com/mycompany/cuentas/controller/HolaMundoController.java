package com.mycompany.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {

	@RequestMapping("/holaMundoSpring")
	public String saludo() {
		System.out.println("Hola Mundo desde Spring MVC");
		return "holaMundoSpring";
	}

}
