package br.org.fcc.concursos.api.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		OpenAPI openApi = new OpenAPI().info(getInfo());


		return openApi;
	}

	private Info getInfo() {
		return new Info()
				.title("Concursos FCC - API")
				.description("Módulo de geração de boletos, arquivos de retorno")
				.version("1.0.0");
	}
	
	

}