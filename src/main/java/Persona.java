import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método estático para filtrar una lista de personas
    public static List<Persona> mayoresDeEdad(List<Persona> personas) {
        List<Persona> mayores = new ArrayList<>();

        for(Persona persona: personas){
            if (persona.getEdad() >= 18) {
                mayores.add(persona);
            }
        }
        return mayores;
    }

}
