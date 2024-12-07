package org.example.supermercado.controller;

import org.example.supermercado.model.Cliente;
import org.example.supermercado.response.ClienteResponseRest;
import org.example.supermercado.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/cliente")

    public ResponseEntity<ClienteResponseRest> consultaCat(){
        ResponseEntity<ClienteResponseRest>  response = clienteService.buscarCategorias();
        return response;

    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<ClienteResponseRest> consultaPorId(@PathVariable Long id){
        ResponseEntity<ClienteResponseRest>  response = clienteService.buscarPorId(id);
        return response;
    }

    @PostMapping("/cliente")
    public ResponseEntity<ClienteResponseRest> crear(@RequestBody Cliente request){
        ResponseEntity<ClienteResponseRest>  response = clienteService.crear(request);
        return response;
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<ClienteResponseRest> actualizar(@RequestBody Cliente request, @PathVariable Long id ){
        ResponseEntity<ClienteResponseRest>  response = clienteService.actualizar(request, id);
        return response;
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<ClienteResponseRest> eliminar(@PathVariable Long id){
        ResponseEntity<ClienteResponseRest>  response = clienteService.eliminar(id);
        return response;
    }

}