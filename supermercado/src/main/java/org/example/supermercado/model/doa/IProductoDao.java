package org.example.supermercado.model.doa;

import org.example.supermercado.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto, Long> {
}
