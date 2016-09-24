/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.estudiante.dao;

import java.util.List;
import mx.edu.utng.estudiante.model.Foro;

/**
 *
 * @author juan-
 */
public interface ForoDAO {
    
    void agregarForo(Foro foro);
    void borrarForo(int idForo);
    void cambiarForo(Foro foro);
    List<Foro>desplegarForo();
    Foro elegirForo(int idForo);
    
}
