package com.kaike.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cotegorias")
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "rest está funcionando";
	}
}
