package Ukeoppgaver35;

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
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

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
}
