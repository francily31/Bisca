package bisca;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Crio o Baralho
public class Baralho {
    
    int rodada = 0;
        int contar = 3;
    
    private List<Carta> cartas;
    private List<Jogador> jogador;

    public Baralho() {
        this.cartas = new ArrayList<>();
        // Crio as Faces
        String[] vfaces = new String[] { "A", "2", "3", "4", "5", "6", "7", "K", "Q", "j" };
        // Crio os Pesos
        int[] vpesos = { 11, 0, 0, 0, 0, 0, 10, 4, 2, 3 };
        // Crio as cartas com os pesos e os nipes
        for (int i = 0; i < vfaces.length; i++) {
            this.cartas.add(new Carta("Copas", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Paus", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Espadas", vfaces[i], vpesos[i]));
            this.cartas.add(new Carta("Ouros", vfaces[i], vpesos[i]));
        }
        
        //aqui se inicia o desenvolvimento das rodadas
        List<String> Jogador = new ArrayList<>();
        
        //começa...
        
        for (int i =)
        for (int x = 0; x < 17; x++){
            System.out.println("...." + rodada);
          
 
        }
        
        while (contar < 3){
            System.out.println("cartas");
        }
        
   
    }
        
        
        
    }
    
    //o baralho estava printando de outro jeito
    
    @Override
    public String toString() {
          StringBuilder sb = new StringBuilder();
      for(Carta c : cartas){
          sb.append(c);
      }
        return sb.toString();
    }
    
}
