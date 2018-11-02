
package accesodedatos.modelo;


public class Cursada {
      
    private int idCursada;
    private Materia materia;
    private Alumno alumno;
    private String fecha;
    private float nota;

    public Cursada(int idCursada, Materia materia, Alumno alumno, String fecha, float nota) {
        this.idCursada = idCursada;
        this.materia = materia;
        this.alumno = alumno;
        this.fecha = fecha;
        this.nota = nota;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
  
}


