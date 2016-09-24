
package mx.edu.utng.estudiante.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author juan-
 */
public class UtilDB {
    
    private static Connection connection;
    
    public static Connection getConnection (){
       if(connection != null){
        return connection;
       } 
       InputStream inputStream = UtilDB.class.getResourceAsStream("/db.properties");
       
       Properties properties = new Properties();
       
       try{
       
           properties.load(inputStream);
           String driver = properties.getProperty("driver");
           String url = properties.getProperty("url");
           String usuario = properties.getProperty("user");
           String password = properties.getProperty("password");
           Class.forName(driver);
           connection = DriverManager.getConnection(url,usuario,password);
       }catch(SQLException e){
           e.printStackTrace();
       }catch(ClassNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
       return connection;
    }

    public static void closeConnection (Connection connection){
    
        if(connection == null){
            return;
        }try{
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

   
}
