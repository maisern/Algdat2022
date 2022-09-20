package Ukeoppgaver38;

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


        // Rekursivt binærsøk
        int[] a = {0, 2, 12, 21, 32, 36, 37, 99 };
        System.out.println(binarySearch(a,1,0,a.length-1));

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





}
