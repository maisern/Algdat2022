package Ukeoppgaver35;

import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {
    private Tabell() {}   // privat standardkonstruktør - hindrer instansiering

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
    public static void bytt(int[]a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    // Metoden randPerm(int n)                   Programkode 1.1.8 e)
    public static int [] randPerm(int n){
        if(n<0){throw new java.util.NoSuchElementException("n kan ikke være negativ");}
        Random r = new Random();
        int[]a=new int[n];

        for( int i=0;i<n;i++){
            int tall = r.nextInt(n);
            if(a[tall]==0) {a[tall] = i;
            }else {i--;}
        }
        return a;
    }

    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int maks(int[] a, int fra, int til)
    {
        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        fratilKontroll(a.length,fra,til);



        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    // Metoden maks(int[] a)                     Programkode 1.2.1 c)
    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    // min-metodene - se Oppgave 1 i Avsnitt 1.2.1
    public static int min1(int[]a,int fra,int til){
        int minp=fra;
        int min=a[fra];

        for(int i=fra;i<til;i++){
            if (a[i]<min){
                min=a[i];
                minp=i;
            }
        }
        return minp;
    }

    public static int min2(int[]a){
        return min1(a,0,a.length);
    }

    public static void bytt(char[] c, int i, int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }

    public static void skriv(int[] a, int fra, int til){
        fratilKontroll(a.length,fra,til);
        for(int i=fra;i<til-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(a[til-1]);
    }


    public static void skriv(int[] a){
        fratilKontroll(a.length,0,a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.print(a[a.length-1]);
    }

    public static void skrivln(int[] a, int fra, int til){
        fratilKontroll(a.length,fra,til);
        for(int i=fra;i<til;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void skrivln(int[] a){
        fratilKontroll(a.length,0,a.length);
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();

    }

    //sjekker at intervallet er ok
    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (tablengde==0){
            throw new ArrayIndexOutOfBoundsException
                    ("tabellen er tom!");
        }

        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }
    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    //metode som sorterer et array i stigende rekkefølge
    public static void sort1(int[]a) {
        for (int i = 0; i < a.length; i++) {
            int min = min1(a, i, a.length);
            bytt(a, min, i);
        }
    }

    //boble-sortering
    public static void bobblesort(int[]a){
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    Tabell.bytt(a, j, j + 1);
                }
            }
        }
    }

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks
}
