package com.example.PaseListaApi.response;

import com.example.PaseListaApi.model.Grupos;

import java.util.List;

public class GrupoResponseRest extends ResponseRest {
    private GrupoResponse grupoResponse = new GrupoResponse();

public GrupoResponse getGrupoResponse(){
return  grupoResponse;
}

public void setGrupoResponse(GrupoResponse grupoResponse){
this.grupoResponse = grupoResponse;
}

}
