/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.estudiante.dao;

import java.util.List;
import mx.edu.utng.estudiante.model.Estudiante;
/**
 *
 * @author juan-
 */
public interface EstudianteDAO {
    void agregarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(int idEstudiante);
    void cambiarEstudiante(Estudiante estudiante);
    List<Estudiante> desplegarEstudiantes ();
    Estudiante elegirEstudiante(int idEstudiante);
}
