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
        mazo[0]=new Carta((byte)1,"Oro");
        mazo[1]=new Carta((byte)2,"Oro");
        mazo[2]=new Carta((byte)3,"Oro");
        mazo[3]=new Carta((byte)4,"Oro");
        mazo[4]=new Carta((byte)5,"Oro");
        mazo[5]=new Carta((byte)6,"Oro");
        mazo[6]=new Carta((byte)7,"Oro");
        mazo[7]=new Carta((byte)10,"Oro");
        mazo[8]=new Carta((byte)11,"Oro");
        mazo[9]=new Carta((byte)12,"Oro");
        mazo[10]=new Carta((byte)1,"Espada");
        mazo[11]=new Carta((byte)2,"Espada");
        mazo[12]=new Carta((byte)3,"Espada");
        mazo[13]=new Carta((byte)4,"Espada");
        mazo[14]=new Carta((byte)5,"Espada");
        mazo[15]=new Carta((byte)6,"Espada");
        mazo[16]=new Carta((byte)7,"Espada");
        mazo[17]=new Carta((byte)10,"Espada");
        mazo[18]=new Carta((byte)11,"Espada");
        mazo[19]=new Carta((byte)12,"Espada");
        mazo[20]=new Carta((byte)1,"Basto");
        mazo[21]=new Carta((byte)2,"Basto");
        mazo[22]=new Carta((byte)3,"Basto");
        mazo[23]=new Carta((byte)4,"Basto");
        mazo[24]=new Carta((byte)5,"Basto");
        mazo[25]=new Carta((byte)6,"Basto");
        mazo[26]=new Carta((byte)7,"Basto");
        mazo[27]=new Carta((byte)10,"Basto");
        mazo[28]=new Carta((byte)11,"Basto");
        mazo[29]=new Carta((byte)12,"Basto");
        mazo[30]=new Carta((byte)1,"Copa");
        mazo[31]=new Carta((byte)2,"Copa");
        mazo[32]=new Carta((byte)3,"Copa");
        mazo[33]=new Carta((byte)4,"Copa");
        mazo[34]=new Carta((byte)5,"Copa");
        mazo[35]=new Carta((byte)6,"Copa");
        mazo[36]=new Carta((byte)7,"Copa");
        mazo[37]=new Carta((byte)10,"Copa");
        mazo[38]=new Carta((byte)11,"Copa");
        mazo[39]=new Carta((byte)12,"Copa");
    }

    
public void barajar(){ //Ezequiel
    
} 
//cambia de posición todas las cartas aleatoriamente.

public void siguienteCarta(){ //Debora
    
} 
//devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

public void cartasDisponibles(){ // Debora
    
} 
//indica el número de cartas que aún se puede repartir.

public void darCartas(){ //Martin
    
} 
//dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.

public void cartasMonton(){ //Martin
    
} 
//mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario

public void mostrarBaraja(){ //Federico
    
} 
//muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.

 
}
