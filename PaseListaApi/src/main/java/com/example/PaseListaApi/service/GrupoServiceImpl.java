package com.example.PaseListaApi.service;

import com.example.PaseListaApi.dao.IGrupoRepository;
import com.example.PaseListaApi.model.Grupos;
import com.example.PaseListaApi.response.GrupoResponseRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Optional;
//Logica de negocio

@Service
public class GrupoServiceImpl implements IGruposService {
    private static final Logger log = LoggerFactory.getLogger(GrupoServiceImpl.class);
    @Autowired
    private IGrupoRepository gruposDAO;

    @Override
    @Transactional
    public ResponseEntity<GrupoResponseRest> crear(Grupos grupos) {
        log.info("Inicio del mecotdo crear por Grupos");
        GrupoResponseRest response = new GrupoResponseRest();
        List<Grupos> list =new ArrayList<>();
        try {
            Grupos gruposGuardar = gruposDAO.save(grupos);
            if (gruposGuardar != null) {
                list.add(gruposGuardar);
                response.getGrupoResponse().setGrupos(list);
                response.setMetada("Respuesta OK", "00", "CREACION exitosa");
            }else {
                log.info("No se encontro la categoria");
                response.setMetada("Respuesta no encontrada" , "-1" , "Categoria no creada");
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            response.setMetada("Error", "-1", "Error al buscar categoria");
            log.error("Error al guardar categorias", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<GrupoResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<GrupoResponseRest>(response, HttpStatus.OK);
    }

    // Otros métodos CRUD
}

