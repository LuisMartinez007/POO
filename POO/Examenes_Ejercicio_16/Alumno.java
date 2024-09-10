package POO.Examenes_Ejercicio_16;

public class Alumno {
    private String num_matricula;
    private String identificacion;
    private String tipo_id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String grupo;
    
    //Getters and Setters
    public String getNum_matricula() {
        return num_matricula;
    }
    public void setNum_matricula(String num_matricula) {
        this.num_matricula = num_matricula;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public String getTipo_id() {
        return tipo_id;
    }
    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
