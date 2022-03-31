package ecc11;

import javax.swing.JOptionPane;

public class ECC11 {

    public static void main(String[] args) {
        // TODO code application logic here
        String frs;
        int a=0, e=0, i=0, o=0, u=0;
        String[] vocal = new String[5]; 
        vocal[0]="a";vocal[1]="e";vocal[2]="i";vocal[3]="o";vocal[4]="u";
        
        frs=JOptionPane.showInputDialog("Entrada de datos","Inserte una frase") ;
        frs=frs.trim();
        
        for (int k = 0; k <= 4; k++) {//este bucle es para cambiar el array
            for (int j = 1; j <= frs.length(); j++) {//este bule es para cambiar de letra en frs
                if( frs.substring(j-1, j).equalsIgnoreCase(vocal[k]) ) {//esto comprueba si la letra es una vocal
                    switch(vocal[k]){
                        case "a" -> a++;
                        case "e" -> e++;
                        case "i" -> i++;
                        case "o" -> o++;
                        case "u" -> u++;
                    }
                }
            }
        }
        
        System.out.println("En la frase <<"+frs+">> hay "+(a+e+i+o+u)+" vocales.");
        if(a>0) System.out.println("La letra a aparece "+a+" veces.");
        if(e>0) System.out.println("La letra e aparece "+e+" veces.");
        if(i>0) System.out.println("La letra i aparece "+i+" veces.");
        if(o>0) System.out.println("La letra o aparece "+o+" veces.");
        if(u>0) System.out.println("La letra u aparece "+u+" veces.");
    }
    
}
