/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodedatos;

import accesodedatos.modelo.Alumno;
import accesodedatos.modelo.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author programador
 */
public class AlumnoDato {
    private Connection con;
    
    public AlumnoDato(Conexion conexion){
          con= conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (nombre, fecnac, activo) VALUES (?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1,alumno.getNombre());
    ps.setDate(2,Date.valueOf(alumno.getFecNac()));
    ps.setBoolean(3, alumno.isActivo());
    int filas= ps.executeUpdate();
    ResultSet rs =ps.getGeneratedKeys();
    
    if(rs.next()){
        alumno.setId(rs.getInt("id"));
    } else {
        System.out.println("No se pudo obtenerel id del alumno");
        
        ps.close();
    }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDato.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    public void borrarAlumno(int id) throws SQLException{
        
     String sql= "DELETE FROM alumno WHERE id =?;";
     
       PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1,id);
             
             ps.executeUpdate();
             
             ps.close();
             
             catch (SQLException ex) {
                     System.out.println("Error al insertar un alumno:" + ex.getMessage());
                     }
}
    
    }
    public void actualizarAlumno(Alumno alumno){
try{
String sql = "UPDATE alumno SET nombre=? ,fecNac = ? , " + "activo=? WHERE id= ?;";
}
PreparedStatement  ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1,alumno.getNombre());
    ps.setDate(2,Date.valueOf(alumno.getFecNac()));
    ps.setBoolean(3, alumno.isActivo())
    ps.setInt(4,alumno.getId());
    ps.executeUpdate();

  ps.close();
             
             catch (SQLException ex) {
                     System.out.println("Error al insertar un alumno:" + ex.getMessage());
                     }
}
      public Alumno buscarAlumno(int id){
Aumno alumno =null;
try{
     String sql = "SELECT + FROM alumno WHERE id=?;";

PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1,id);

ResultSEt resultSet= ps.executeQuery();

while(resultSet.next()){
alumno= new Alumno();
alumno.setId(result.getInt("id"));
alumno.setNombre(resultSet.getString("nombre"));
alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
alumno.setActivo(resultSet.getBoolean("activo"));
}
}
}
}