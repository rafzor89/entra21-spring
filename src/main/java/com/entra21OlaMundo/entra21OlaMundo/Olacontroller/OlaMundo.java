package com.entra21OlaMundo.entra21OlaMundo.Olacontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {
	
	@RequestMapping(value="/ola", method = ResquestMethod.GET)
	public String ola() {
		return "olá";
	}
	
}
