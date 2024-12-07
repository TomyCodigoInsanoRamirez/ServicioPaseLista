package org.example.supermercado.model.doa;

import org.example.supermercado.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
