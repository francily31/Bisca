package bisca;

//estrutura das Cartas
public class Carta {
    private String nipe;
    private String face;
    private int peso;

    public Carta(String face, String nipe, int peso) {
        this.face = face;
        this.nipe = nipe;
        this.peso = peso;
    }

    public String getNipe() {
        return nipe;
    }

    public void setNipe(String nipe) {
        this.nipe = nipe;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nipe + " de " + face + "\n";
    }

}
