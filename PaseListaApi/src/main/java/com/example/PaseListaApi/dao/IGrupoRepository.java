package com.example.PaseListaApi.dao;

import com.example.PaseListaApi.model.Grupos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IGrupoRepository extends CrudRepository<Grupos, Long> {

}