package trabajoaulico;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {

    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
        mazo=new ArrayList();
        monton=new ArrayList();
        cargaCartas();
    }

    public void cargaCartas() { //faltaría automatizar | Ezequiel
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {//4 iteraciones por cada palo del String lo va llenando con cartas del 1 al 12 sin 8 y 9
            for (byte numero = 1; numero <= 12; numero++) {//llena con cartas del 1 a 12
                if (numero != 8 && numero != 9) {//saco los 8 y 9
                    mazo.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() { //Ezequiel
        Random random = new Random();
//        for (int i = mazo.length - 1; i > 0; i--) {//empezando del final hasta el inicio
//            int posAleatoria = random.nextInt(i + 1);
//            Carta temp = mazo[i];
//            mazo[i] = mazo[posAleatoria];
//            mazo[posAleatoria] = temp;
//        }
    }
//cambia de posición todas las cartas aleatoriamente.

    public void siguienteCarta() { //Debora
        if(mazo.isEmpty()){
            System.out.println("No quedan cartas en el mazo.");
        }else{
            System.out.println("Carta devuelta:"+mazo.get(mazo.size()-1).getNum()+" de "+mazo.get(mazo.size()-1).getPalo());
            monton.add(mazo.get(mazo.size()-1));
            mazo.remove(mazo.size()-1);
        }
    
    }
//devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

    public int cartasDisponibles() { // Debora
        System.out.println("El número de cartas que aún se pueden repartir es: "+mazo.size()); 
        return mazo.size();
    }
//indica el número de cartas que aún se puede repartir.

    public void darCartas(int n) { //Martin
        
        if(n > cartasDisponibles()){
            System.out.println("No hay "+n+" cartas disponibles.");
        }else{
            for (int i = 0; i < n; i++) {
                siguienteCarta();
            }            
        }
    }
//dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.

    public void cartasMonton() { //Martin
        System.out.println("Las cartas del montón son: ");
        if (monton.isEmpty()) {
            System.out.println("No hay cartas en el montón.");
        } else {
            System.out.println(monton);
        }
    }
//mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario

    public void mostrarBaraja() { //Federico
        System.out.println("La baraja actual es: ");
        
        if(!mazo.isEmpty()){
        System.out.println(mazo);            
        }else{
            System.out.println("No quedan cartas en la baraja");
        }
        
    }
//muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.

}
