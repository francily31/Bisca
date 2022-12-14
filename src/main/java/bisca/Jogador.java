package bisca;

public class Jogador {
    
    private final Carta[] hand; //mão do jogador
    private final int MAX_CARTAS = 3; //maximo de cartas que pode ter na mão
    private int cartaAtual;  //quantas cartas ele tem na mão
    
    //atributos do jogador
    public Jogador() {  
        hand = new Carta[MAX_CARTAS];
        cartaAtual = 0;
}
    //se a mão ainda não está cheia ele recebe ate encher
    public void receberCarta(Carta carta) {
        if (cartaAtual < MAX_CARTAS) {
            hand[cartaAtual++] = carta;
        }
    }
    
    //inicia a carta
    public Carta iniciarCarta(int index) {
        Carta temp = hand[index]; // recupero a carta escolhida
        hand[index] = null; // remove a carta da mão
        return temp; // retorna a carta escolhida
    }
    
    @Override
    
    //imprime as 3 cartas do jogador
    public String toString() {
        String Jogador = "";
        for (int i = 0; i < hand.length; i++) {
            Jogador += "(" + i + ") " + hand[i] + " ";
        }
        return Jogador;
    }
}