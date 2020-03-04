package com.crud.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.interfaceService.IclientService;
import com.crud.demo.modelo.Client;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IclientService service;
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Client>client=service.listar();
			model.addAttribute("client", client);	
		return "index";
	}
	
}
