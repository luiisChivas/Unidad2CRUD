/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.estudiante.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.edu.utng.estudiante.model.Foro;
import mx.edu.utng.estudiante.util.UtilDB;

/**
 *
 * @author juan-
 */
public class ForoDAOImp implements ForoDAO{
     private Connection connection;
    public ForoDAOImp(){
        connection = UtilDB.getConnection();
    }
    
    @Override
    public void agregarForo(Foro foro) {
        try {
            String query="INSERT INTO foro (titulo,descripcion,estado) "+
                    " values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, foro.getTitulo());
            ps.setString(2, foro.getDescripcion());
            ps.setInt(3, foro.getEstado());
            ps.executeUpdate();
            ps.close();;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void borrarForo(int idForo) {
        try {
            String query = "DELETE FROM foro WHERE"
                    +" id_foro = ?";
            PreparedStatement ps  = connection.prepareStatement(query);
            ps.setInt(1,idForo);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void cambiarForo(Foro foro) {
    
              try {
            String query="UPDATE foro SET titulo = ?"
                    +",descripcion = ?"
                    +",estado = ?"
                    +"WHERE id_foro = ?";
                    
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, foro.getTitulo());
            ps.setString(2, foro.getDescripcion());
            ps.setInt(3, foro.getEstado());
            ps.setInt(4, foro.getIdForo());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<Foro> desplegarForo() {
       List<Foro> foros = new ArrayList<Foro>();
        try {
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT * FROM foro");
                    while (rs.next()) {
                Foro foro = new  Foro(
                        rs.getInt("id_foro")
                        ,rs.getString("titulo")
                        , rs.getString("descripcion")
                        ,rs.getInt("estado"));
                
                foros.add(foro);
            }
                    rs.close();
                    statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

      return foros;
    }

    @Override
    public Foro elegirForo(int idUsuario) {
         Foro foro = null;
        try {
            String query ="SELECT * FROM foro WHERE id_foro = ?";
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setInt(1, idUsuario);
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
              foro = new  Foro(
                        rs.getInt("id_foro")
                        ,rs.getString("titulo")
                        , rs.getString("descripcion")
                        ,rs.getInt("estado"));
            }
                    rs.close();
                    statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

      return foro;
    }
    
    
}
