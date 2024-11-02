import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana",17));
        personas.add(new Persona("Pedro", 30));
        personas.add(new Persona("jose", 16));

        List<Persona> mayores = Persona.mayoresDeEdad(personas);

        for (Persona persona : mayores) {

            System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");

        }
    }
}