package Ukeoppgaver35;

import java.util.Arrays;
import java.util.Random;

public class Oppgave35 {

    /*
    public static void main(String[] args) {
        int[]array = randArray(0,10,10);
        System.out.println(Arrays.toString(array));
        System.out.println("Det nest største tallet er: " + nestS(array));
    }
    */



        public static void main(String [] args)      // hovedprogram
        {
            int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
            int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

            int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

            Tabell.skrivln(a);        // se Oppgave 5 i Avsnitt 1.2.2
            System.out.print("Størst(" + a[m] + ") har posisjon " + m);
            System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);

            // Eksempel på en utskrift:

            // 12 16 15 6 10 8 9 2 14 19 5 18 20 13 3 7 11 1 4 17
            // Størst(20) har posisjon 12, nest størst(19) har posisjon 9

        } // main



    //metode som returnerer det nest største tallet
    public static int nestS (int[]a){
        int max=a[1];
        int nMax=a[0];
        if(nMax>max){
            max=nMax;
            nMax=a[1];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]>nMax ){
                if (a[i]>max){
                    nMax=max;
                    max=a[i];
                }else{
                    nMax=a[i];
                }
            }

        }
        return nMax;
    }

    //metode som lager array med tilfeldige verdier fra og med min til max med bestemt lengde
    public static int [] randArray(int min, int max, int lengde){
        Random r = new Random();
        int[]a=new int[lengde];
        for (int i=0;i<lengde;i++){
            int tall = r.nextInt(min+max)-min;
            a[i]=tall;
        }
        return a;
    }
}
