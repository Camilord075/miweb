package co.com.camilo;

public class Persona {
    private String nombre;
    private String apellido;
    private final int idPersona;
    private static int contadorPersonas;

    private Persona(){
        this.idPersona = ++Persona.contadorPersonas;
    }

    public Persona(String nombre, String apellido){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona: { nombre = " + this.nombre + " apellido = " + this.apellido + " idPersona = " + this.idPersona + "}";
    }
}