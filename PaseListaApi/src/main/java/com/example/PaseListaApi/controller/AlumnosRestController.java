package com.example.PaseListaApi.controller;


import com.example.PaseListaApi.model.Alumnos;
import com.example.PaseListaApi.response.Alumnos.AlumnosResponseRest;
import com.example.PaseListaApi.service.Alumnos.AlumnosServiceImpl;
import com.example.PaseListaApi.service.Alumnos.IAlumnosService;
import com.example.PaseListaApi.service.Grupos.GrupoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/v3")
public class AlumnosRestController implements IAlumnosService {
    private static final Logger log = LoggerFactory.getLogger(AlumnosServiceImpl.class);
    @Autowired
    private AlumnosServiceImpl alumnosService;

    @GetMapping("/alumnos")
    public ResponseEntity<AlumnosResponseRest> consultarAlumnos() {
        ResponseEntity<AlumnosResponseRest> response = alumnosService.consultarAlumnos();
        return response;
    }

    @Override
    @GetMapping("/alumnos/{id}")
    public ResponseEntity<AlumnosResponseRest> consultarAlumnosId(@PathVariable Long id) {
        ResponseEntity<AlumnosResponseRest> response = alumnosService.consultarAlumnosId(id);
        return response;
    }
    @PostMapping("/alumnos")
    public ResponseEntity<AlumnosResponseRest> crear(@RequestBody Alumnos request){
        log.info("Inicio del metodo crear ALUMNOS");
        ResponseEntity<AlumnosResponseRest> response = alumnosService.crear(request);
        return response;
    }
    @PutMapping("/alumnos/{id}")
    public ResponseEntity<AlumnosResponseRest> actualizar(@RequestBody Alumnos request, @PathVariable Long id){
        log.info("Inicio del metodo actualizar");
        ResponseEntity<AlumnosResponseRest> response = alumnosService.actualizar(request, id);
        return response;
    }


}
