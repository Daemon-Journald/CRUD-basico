package com.dominio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de la pagina principal
 */
@Controller
public class IndexControlador {

    @GetMapping("/")
    String index() {
        return "index";
    }

}
