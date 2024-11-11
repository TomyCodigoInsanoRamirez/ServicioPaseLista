package com.example.PaseListaApi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateria;
    private String nombreMateria;

    @ManyToOne
    @JoinColumn(name = "idGrupo")
    private Grupos grupo;

    private Boolean estado;

    public Materia() {
        this.estado = true;
    }
    public Materia(String nombreMateria, Grupos grupo) {
        this.nombreMateria = nombreMateria;
        this.grupo = grupo;
        this.estado = true;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
