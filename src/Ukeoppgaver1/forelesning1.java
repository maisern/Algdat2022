package Ukeoppgaver1;
import java.util.Random;

public class forelesning1 {
    public static void main(String[] args) {

        int[] a =new int[100]; //definerer array med lengde

        Random rand = new Random(); //gir array tilfeldige verdier
        int upper =a.length;
        for(int i=0;i<upper;i++) {
            int tall = rand.nextInt(upper);
            a[i]=tall;
        }

        int max = a[0]; //det største tallet
        int endringer = 0; //antall endringer for max

        for (int i=1; i<a.length; i++){ //finner største verdi
            int verdi = a[i];
            if (verdi>max){
                max=verdi;
                endringer++;

            }
        }
        for(int i=0; i<a.length-1;i++){ //skriver ut array, max og endringer
            System.out.print(a[i]+", ");
        }
        System.out.println(a[a.length-1]);
        System.out.println(max + " og " + endringer);

    }
}
