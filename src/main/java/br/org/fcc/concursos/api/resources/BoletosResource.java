package br.org.fcc.concursos.api.resources;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/v1/boletos" )
@Tag(name = "Boletos")
public class BoletosResource {

	@Operation(summary = "Registrar e gerar boleto bancário Bradesco")
	@GetMapping("/bradesco")
	public String criarBoletoBradesco(@PathParam(value = "numeroPedido") final Integer numeroPedido) {
		return "Gerar boleto bancário Bradesco!";
	}
		
	@Operation(summary = "Gerar boleto bancário Banco do Brasil")
	@GetMapping("/banco-do-brasil")
	public String criarBoletoBancoDoBrasil(@PathParam(value = "numeroPedido") final Integer numeroPedido) {
		return "Gerar boleto bancário Banco do Brasil!";
	}
	
}
