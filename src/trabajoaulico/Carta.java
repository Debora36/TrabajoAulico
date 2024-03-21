package trabajoaulico;

public class Carta {
    private byte num;
    private String palo;

    public Carta(byte num, String palo) {
        this.num = num;
        this.palo = palo;
    }
    
    public byte getNum() {
        return num;
    }
    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }   
}
