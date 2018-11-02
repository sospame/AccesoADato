/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasedatos;

import java.sql.Connection;
import java.sql.Dajte;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author programador
 */
public class AccesoABaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      
        static void main(String[] args)  {
        try {
            // TODO code application logic here
            String url="jdbc:mysql://localhost/prueba";
            String usuario="root";
            String password="";
            
            
            //Cargamos las clases de mariadb que implementan JDBC
            Class.forName("org.mariadb.jdbc.Driver");
            
            Connection con= DriverManager.getConnection(url + 
                    "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                    + "&user=" + usuario + "&password=" + password);
            
                      
            
            
            PreparedStatement ps=con.prepareStatement
           ("INSERT INTO Alumno (nombre,fecNac, activo) VALUES ( ?, ?, ?);");
            
            
            ps.setString(1, "Sosa Juan");
            
            LocalDate nac=LocalDate.of(2018, Month.MARCH, 10);
            ps.setDate(2, Date.valueOf(nac));
                       
            
            ps.setBoolean(3, true);
            int filas=ps.executeUpdate();
            System.out.println("Filas agregadas "+filas);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver"+ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dia3.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }
        
       
        
  
        // TODO code application logic here
    }
    

