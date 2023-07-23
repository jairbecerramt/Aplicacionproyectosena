package colegio;

public class Persona {
    private String identificacion;
    private String nombre;
    private String correo;
    private String apellidos;
    private String fechanacimiento;
    private String direccion;
    private String telefono;

    public Persona(String identificacion, String nombre, String correo, String apellidos, String fechanacimiento, String direccion, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }    
    
}
