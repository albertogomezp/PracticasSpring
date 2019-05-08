package com.thana.sprinboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thana.sprinboot.app.model.service.Iservicio;

@Controller
public class IndexController {
	
	@Autowired
	private Iservicio servicio;

	


	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());

		return "index";
	}

	
	
}