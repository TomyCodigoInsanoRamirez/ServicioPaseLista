package org.example.supermercado.service;


import org.example.supermercado.model.Cliente;
import org.example.supermercado.response.ClienteResponseRest;
import org.springframework.http.ResponseEntity;

public interface IClienteService {


    public ResponseEntity<ClienteResponseRest> buscarCategorias();
    public ResponseEntity<ClienteResponseRest> buscarPorId(Long id);
    public ResponseEntity<ClienteResponseRest> crear(Cliente cliente);
    public ResponseEntity<ClienteResponseRest> actualizar( Cliente cliente, Long id);
    public ResponseEntity<ClienteResponseRest> eliminar( Long id);


}
