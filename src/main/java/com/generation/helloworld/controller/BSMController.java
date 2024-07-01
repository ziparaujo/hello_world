package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	@GetMapping
	public String bsmController() {
		return "- Mentalidade de crescimento"
				+ "\n- Responsabilidade pessoal"
				+ "\n- Persistência"
				+ "\n- Comunicação"
				+ "\n- Trabalho em equipe"
				+ "\n- Proatividade";
	}
}
