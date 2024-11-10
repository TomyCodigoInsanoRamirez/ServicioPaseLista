package com.example.PaseListaApi.controller;

import com.example.PaseListaApi.model.Grupos;
import com.example.PaseListaApi.response.GrupoResponseRest;
import com.example.PaseListaApi.service.GrupoServiceImpl;
import com.example.PaseListaApi.service.IGruposService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v1")
public class GrupoRestController implements IGruposService {
    private static final Logger log = LoggerFactory.getLogger(GrupoServiceImpl.class);
    @Autowired
    private GrupoServiceImpl grupoService;



    @PostMapping("/grupos")
    public ResponseEntity<GrupoResponseRest> crear(@RequestBody Grupos request) {
        log.info("Inicio del mecotdo crear por Categoria");
        ResponseEntity<GrupoResponseRest> response = grupoService.crear(request);
        return response;
    }

}
