package bisca;

// Para as cartas serem criadas individualmente eu preiciso de um construtor para elas.
public class Carta {
    private String nipe;
    private String face;
    private int peso;
    
    public Carta(String nipe, String face, int peso) {
        this.nipe = nipe;
        this.face = face;
        this.peso = peso;
    }

    Carta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Carta{" + "nipe=" + nipe + ", face=" + face + ", peso=" + peso + '}';
    }
          

}
