package Ukeoppgaver37;

import Ukeoppgaver35.Tabell;
public class Oppgave37 {

    public static void main(String[] args) {
        int[] a = {5,2,7,3,9,1,8,4,6};
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        char[] b = {'i', 't', 'u', 'l', 'p'};

        int k = Tabell.maks(a);     // posisjonen til den største i a
        int l = Tabell.maks(d);     // posisjonen til den største i d
        int m = Tabell.maks(s);     // posisjonen til den største i s
        int n = Tabell.maks(b);

        System.out.println(a[k] + "  " + d[l] + "  " + s[m] + " " + b[n]);

        // Utskrift:  9  7.12  Thanh
    }
}
