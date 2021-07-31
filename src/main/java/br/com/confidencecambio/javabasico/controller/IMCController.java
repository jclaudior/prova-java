package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.math.BigDecimal;

@RestController

@RequestMapping(path = "/IMC")
public class IMCController {

    @Autowired
    IMCService service;

    @GetMapping(path = "/peso/{peso}/altura/{altura}")
    public ResponseEntity<?> calculaIMC(@PathVariable BigDecimal peso, @PathVariable BigDecimal altura){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.calculaIMC(peso, altura));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
}
