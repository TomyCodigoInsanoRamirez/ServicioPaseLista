package org.example.supermercado.service;


import org.example.supermercado.model.Cliente;
import org.example.supermercado.model.Producto;
import org.example.supermercado.response.ClienteResponseRest;
import org.example.supermercado.response.ProductoResponseRest;
import org.springframework.http.ResponseEntity;

public interface IProductoService {


    public ResponseEntity<ProductoResponseRest> buscarProducto();
    public ResponseEntity<ProductoResponseRest> buscarPorId(Long id);
    public ResponseEntity<ProductoResponseRest> crear(Producto producto);
    public ResponseEntity<ProductoResponseRest> actualizar( Producto producto, Long id);
    public ResponseEntity<ProductoResponseRest> eliminar( Long id);


}
