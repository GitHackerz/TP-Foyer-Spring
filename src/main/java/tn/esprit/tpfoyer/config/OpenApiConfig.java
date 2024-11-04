package tn.esprit.tpfoyer.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "OpenApi specification - TP Foyer project",
                description = "This is a sample OpenApi specification for TP Foyer project project",
                version = "1.0"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8085/api"
                ),
        }
)
public class OpenApiConfig {
}