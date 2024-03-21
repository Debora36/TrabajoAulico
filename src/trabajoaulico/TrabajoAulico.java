package trabajoaulico;

public class TrabajoAulico {

    public static void main(String[] args) {
        Baraja mazo = new Baraja();
        
        mazo.mostrarBaraja();
        mazo.darCartas(5);
        mazo.mostrarBaraja();
        mazo.cartasMonton();
    }

}
