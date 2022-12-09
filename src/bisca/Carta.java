package bisca;

public class Carta {
    private String nipe;
    private String face;
    private int peso;
    
    public Carta(String nipe, String face, int peso) {
        this.nipe = nipe;
        this.face = face;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carta{" + "nipe=" + nipe + ", face=" + face + ", peso=" + peso + '}';
    }
          

}
