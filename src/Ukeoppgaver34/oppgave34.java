package Ukeoppgaver34;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class oppgave34 {

    public static void main(String[] args) {

        //int[] a = {2,4,3,14,8,1,56,5};

        //System.out.println(min(a));
        //System.out.println(Arrays.toString(minmax(a)));
        //System.out.println(fak(6));
        //System.out.println(maks(a));


        // 1.1.10.1:
        // main-metoden i class Program skal nå inneholde:
        int n = 10000, antall = 2000; // tabellstørrelse og gjentagelser
        long tid = 0;                    // for tidsmåling
        int a[] = randPerm(n);
        //System.out.println(Arrays.toString(a));

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) kostnader(a);
        tid = System.currentTimeMillis() - tid;    // medgått tid
        System.out.println("Faste kostnader: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks1(a);  // Programkode 1.1.2
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks1-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks2(a);  // Programkode 1.1.4
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks2-metoden: " + tid + " millisek");

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) maks3(a);  // Programkode 1.1.5
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("Maks3-metoden: " + tid + " millisek");
        }


    //1.1.2
    public static int maks1(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int maxindex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxindex]) {
                maxindex = i;
            }
        }
        return maxindex;
    }

    //1.1.4
    public static int maks2(int[] a)   // versjon 2 av maks-metoden
    {
        int maxindex = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            maxindex = i;                // indeks til største verdi oppdateres
        }
        return maxindex;   // returnerer indeks/posisjonen til største verdi

    } // maks


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
    public static int maks3(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)  if (a[i] >= maksverdi)       // denne blir sann til slutt
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
    }


    //1.1.10.1
    public static int kostnader(int[] a)  // legges i class Program
    {
        int m = 0;
        for (int i = 1; i < a.length; i++) {}  // en tom blokk
        return m;
    }


    //metode som lager en tilfeldig permutasjon med n tall
    public static int[]randPerm(int n){
        if(n<0){
            throw new java.util.NoSuchElementException("n kan ikke være negativ");
            }
        Random r = new Random();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            int tall = r.nextInt(n);
            boolean exist=false;
            for (int j=0;j<i;j++){
                if(a[j]==tall){
                    exist=true;
                    i--;
                }
            }
            if(!exist){
                a[i]=tall;
            }
        }
        return a;
    }

}