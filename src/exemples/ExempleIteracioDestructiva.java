package exemples;
import java.util.ArrayList;
import java.util.List;

public class ExempleIteracioDestructiva {
    public static void main(String[] args) {
        List<String> llista = new ArrayList<>();
        llista.add("A");
        llista.add("B");
        llista.add("C");
        llista.add("D");
        llista.add("E");

        // Iteració destructiva incorrecta
        for (String element : llista) {
            if (element.equals("C")) {
                llista.remove(element);
                // Aquí sí que és probable que es llenci l'excepció
            }
        }
        System.out.println(llista);
    }
}
