package Ukeoppgaver1;

import java.util.Arrays;

public class oppgave1 {

    public static void main(String[] args) {

        int[] a = {2,4,3,14,8,1,56,5};

        //System.out.println(min(a));
        //System.out.println(Arrays.toString(minmax(a)));
        //System.out.println(fak(6));
        System.out.println(maks(a));

        }


    //1.1.2
    public static int min(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int minindex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minindex]) {
                minindex = i;
            }
        }
        return minindex;
    }


    //1.1.3.5
    public static int[] minmax(int[] a){

        int M=a[0];
        int m=a[0];
        int Mp=0;
        int mp=0;

        for(int i=1;i<a.length;i++){
            int verdi=a[i];
            if(verdi>M){
                M=a[i];
                Mp=i;
            }
            if(verdi<m) {
                m=a[i];
                mp=i;
            }
        }
        return new int[]{mp,Mp};
        //med to tall i a blir det gjort 4 sammenlikninger
    }


    //1.1.3.6
    public static long fak (int n){
        int sum=n;
        for (int i=n-1; i>0;i--){
            sum=sum*i;
        }
        return sum;
    }
    //1.1.5.1

    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
}