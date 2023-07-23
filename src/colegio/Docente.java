package colegio;

public class Docente extends Persona {    
    private String Profesion;
    public Docente(String Profesion, String identificacion, String nombre, String correo, String apellidos, String direccion , String fechanacimiento,String telefono) {
        super(identificacion, nombre, correo, apellidos, direccion, fechanacimiento, telefono);
        this.Profesion = Profesion;
    }

    public String getProfesion() {
        return Profesion;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getProfesion();
    }       
    
    
}