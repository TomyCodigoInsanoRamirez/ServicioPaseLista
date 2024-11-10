package com.example.PaseListaApi.service;

import com.example.PaseListaApi.model.Grupos;
import com.example.PaseListaApi.response.GrupoResponseRest;
import org.springframework.http.ResponseEntity;

public interface IGruposService {
    public ResponseEntity<GrupoResponseRest> crear(Grupos grupos);

}
