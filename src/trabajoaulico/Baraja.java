package trabajoaulico;

import java.util.ArrayList;

public class Baraja {
    private Carta[] mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
        mazo=new Carta[40];
        cargaCartas();
    }
    
    public void cargaCartas(){ //faltaría automatizar | Ezequiel
       
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        int i = 0;
        for (String palo: palos) {//4 iteraciones por cada palo del String lo va llenando con cartas del 1 al 12 sin 8 y 9
           for (byte numero = 1; numero <= 12; numero++) {//llena con cartas del 1 a 12
               if (numero != 8 && numero != 9) {//saco los 8 y 9
                   mazo[i]= new Carta(numero,palo);//lleno el mazo con cartas 
                   i++;
               }
            } 
        }
    }
public void barajar(){ //Ezequiel
    
} 
//cambia de posición todas las cartas aleatoriamente.

public void siguienteCarta() { //Debora
        int tamaño = mazo.length;
        if (tamaño != 0) {
            System.out.println(mazo[tamaño].toString());

        } else {
            System.out.println("No hay más cartas en el mazo");
        }
}        
//devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

public void cartasDisponibles(){ // Debora
    
} 
//indica el número de cartas que aún se puede repartir.

public void darCartas(int n){ //Martin
    for (int i = 0; i < 40; i++) {
        while(mazo[i]!=null && n>0){
            System.out.println("");
        }
    }
} 
//dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.

public void cartasMonton(){ //Martin
    
} 
//mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario

public void mostrarBaraja(){ //Federico
    
} 
//muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.

 
}
