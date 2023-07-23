package colegio;

 
 
public class Alumno extends Persona{
    private String Genero;
    public Alumno(String Genero, String identificacion, String nombre, String correo,String apellidos, String direccion , String fechanacimiento,String telefono) {
        super(identificacion, nombre, correo,apellidos,direccion,fechanacimiento,telefono);
        this.Genero = Genero;
    }   
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    @Override
    public String toString() {
        return this.getNombre();
    }  
}