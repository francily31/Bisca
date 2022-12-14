package bisca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Crio o Baralho
public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        // Crio as Faces
        String[] vfaces = new String[] { "A", "2", "3", "4", "5", "6", "7", "K", "Q", "j" };
        // Crio os Pesos
        int[] vpesos = { 11, 0, 0, 0, 0, 0, 10, 4, 2, 3 };
        // Crio as cartas com os pesos
        for (int i = 0; i < vfaces.length; i++) {
            this.cartas.add(new Carta("Copas", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Paus", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Espadas", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Ouros", vfaces[i], vpesos[i]));
        }
        // função que embaralha
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        return "Baralho{" + "cartas=" + cartas + '}';
    }
}
