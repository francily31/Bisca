package bisca;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

        public Baralho() {
            this.cartas = new ArrayList<>();
                String[] vfaces = new String[] { "A", "2", "3", "4", "5", "6", "7", "K", "Q", "j" };
                //Int[] vpesos = new int[] { "11", "0", "0" " 0", "0", "0","10", "4", "2", "3" };
                for(int i = 0; i < vfaces.length; i++) {
                    this.cartas.add(new Carta( "Copas", vfaces[i], 0));
                    this.cartas.add(new Carta( "Paus", vfaces[i], 0));
                    this.cartas.add(new Carta( "Espadas", vfaces[i], 0));
                    this.cartas.add(new Carta( "Ouros", vfaces[i], 0));
                }
        }

    @Override
    public String toString() {
        return "Baralho{" + "cartas=" + cartas + '}';
    }
}
