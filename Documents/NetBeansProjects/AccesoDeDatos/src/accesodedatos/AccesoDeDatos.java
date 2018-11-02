
package accesodedatos;

import accesodedatos.modelo.Alumno;
import java.time.Month;
import java.time.LocalDate;



public class AccesoDeDatos {
    
    public static void main(String[] args) {
        try {
        AlumnoDato alumnoDato = new AlumnoDato(conexion);
       
 Alumno karina= new Alumno("Lopez Karina", LocalDate.of(1976,alumnoDato.guardarAlumno(karina);
 
    for(Alumno it:alumnoDato.obtenerAlumno()){
        
    System.out.println("ID: "+it.getId());
    System.out.println("Nombre: "+it.getNombre());
    }
    alumnoDato.borrarAlumno(karina.getId());
}
    }
 }