package bisca;

import java.util.List;
import java.util.ArrayList;

//Extrutura do jogador
public class Jogador {
    private String Nome;
    private int Pontos;
    private List<Carta> cartasjogador = new ArrayList<>();

    public Jogador(String Nome, int Pontos, List<Carta> cartasjogador) {
        this.Nome = Nome;
        this.Pontos = Pontos;
        this.cartasjogador = cartasjogador;
    }

    public Jogador() {
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getPontos() {
        return Pontos;
    }

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }

    public List<Carta> getCartasjogador() {
        return cartasjogador;
    }

    public void setCartasjogador(List<Carta> cartasjogador) {
        this.cartasjogador = cartasjogador;
    }


    @Override
    public String toString() {
        return "Jogador{" + "Nome=" + Nome + ", Pontos=" + Pontos + ", cartasjogador=" + cartasjogador + '}';
    }

}
