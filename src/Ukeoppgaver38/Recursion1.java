package Ukeoppgaver38;

import Ukeoppgaver35.Tabell;

import java.util.Arrays;

public class Recursion1 {

    /*//// Rekursjon
    * Funksjinen må ha et eller flere basistilfeller som kan behandles uten nye rekursive kall
    * Funksjonen mp kalle seg selv på tilfeller som er "enklere" enn det den ble kalt med.
        -(slik at basistilfellet nås)
    * Uten disse får vi en uendelig rekursjon (stackOverflow)
     */

    public static void main(String[] args) {
        /*
        System.out.println("Rekursjon!");
        counstdown(10);

        //Fakultet
        System.out.println();
        System.out.println(faktorial(5));

        for (int i=0;i<5;i++){
            System.out.println(i+ "! = " + faktorial(i));
        }
         */


        int [] b = {1,2,3,4,5,6,7,8,99};

        int row = 3;
        int col = 3;

        //matrise
        int [][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,99}
        };


        /*
        for(int i: a){
            System.out.println("Verdi " +i + " er på plass "+ binarySearch(a,i,0,a.length-1));
        }

         */
    }


    public static void counstdown(int n){
        //basistilfelle
        if(n==0){
            System.out.println(n+" lift-off!");
            return;
        }

        System.out.println(n+" ...");
        counstdown(n-1);

    }

    public static int faktorial(int n){
        if (n==0) return 1;
        return n*faktorial(n-1);
    }

    public static int binarySearch (int[] a, int verdi, int v, int h) {

        if (v == h) {
            if (a[v] == verdi) return v;
        }else {
            int m = (v+h)/2;
            if (a[m] == verdi) return m;
            if (verdi > a[m]) return binarySearch(a, verdi, m + 1, h);
            else return binarySearch(a, verdi, v, m - 1);

        }
        return -v-1;
    }

    //for å slippe å initiere k i main
    public static void permutasjon(int[] x){
        for (int i=0; i< x.length; i++){
            Tabell.bytt(x,i,0);
            permutasjon(x,1);
            Tabell.bytt(x,0,i);
        }
    }

    public static void permutasjon(int[] x, int k){
        if (k == x.length) System.out.println(Arrays.toString(x));

        for (int i=k; i< x.length; i++){
            Tabell.bytt(x,i,k);
            permutasjon(x,k+1);
            Tabell.bytt(x,k,i);
        }
    }

    public static void hanoiTower(int a, int b, int c, int lengde){
        if(lengde==0) return;
        hanoiTower(a,b,c, lengde-1);
        //flytt dederste fra a til c
        //hanoiTower(a,b,c,);
    }
}
