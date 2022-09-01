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
            int[] a = Tabell.randPerm(2); // tilfeldig permutasjon av 1 . . n-1
            Tabell.sortering(a);  //
            System.out.println(Arrays.toString(a));
            Tabell.skriv(a);
        }



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
