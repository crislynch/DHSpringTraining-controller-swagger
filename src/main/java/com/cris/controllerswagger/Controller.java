package com.cris.controllerswagger;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successo"),
            @ApiResponse(responseCode = "400", description = "Richiesta non valida"),
            @ApiResponse(responseCode = "500", description = "Errore interno del server")
    })
    public String name(@RequestParam String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/reverse")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successo"),
            @ApiResponse(responseCode = "400", description = "Richiesta non valida"),
            @ApiResponse(responseCode = "500", description = "Errore interno del server")
    })
    public String reverse(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
