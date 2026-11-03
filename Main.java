import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Medio> arreglo = new ArrayList<>();
        
        arreglo.add(new Cancion("reverie", "mozart", 3, "clasica"));
        arreglo.add(new Pelicula("Jaws", "Spielberg", 120, "suspenso"));

        for (Medio item : arreglo) {
            item.reproducir();
        }
    }
}