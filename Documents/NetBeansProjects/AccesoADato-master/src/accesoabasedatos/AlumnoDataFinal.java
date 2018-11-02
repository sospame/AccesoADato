/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasedatos;

/**
 *
 * @author programador
 */
public class AlumnoDataFinal {
    private conexion conect
    
    public AlumnoDataFinal(conexion)
    conect = conexion.getConexion()
}

public void guardarAlumno(Alumno alumno) {
String = INSERT INTO alumno (nombre, Fec_Nac, activo) VALUES ()
PreparedStatment pst = preparedStatment(sql, Statment.)

ps-setString(1,alumno.getNombre())
ps-set-Date
ps-setBoolean(3, alumno, inactivo())

int filas = ps-executeUpdate

if(rs.next()) {
alumno.setId().rs.getInt("id");
}else{system.out.println("No se pudo obtener el id del alumno");

}
ps.close