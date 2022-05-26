package br.org.fcc.concursos.api.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/v1/retornos" )
@Tag(name = "Retornos")
public class PagamentosResource {

	@Operation(summary = "Processar arquivo de retorno")
	@PostMapping("/arquivos-retorno")
	public String processarArquivoRetorno(@RequestParam("arquivo") MultipartFile arquivo) {
		return "Processar arquivo de retorno!";
	}
	
	
}
