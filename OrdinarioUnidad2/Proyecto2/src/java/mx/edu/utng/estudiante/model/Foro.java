/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.estudiante.model;

/**
 *
 * @author juan-
 */
public class Foro {
    private int idForo;
    private String titulo;
    private String descripcion;
    private int estado;

    public Foro() {
        this(0,"","",0);
    }
    
    public Foro(int idForo, String titulo, String descripcion, int estado) {
        this.idForo = idForo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdForo() {
        return idForo;
    }

    public void setIdForo(int idForo) {
        this.idForo = idForo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Foro{" + "idForo=" + idForo + ", titulo=" + titulo + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    } 
    
}
