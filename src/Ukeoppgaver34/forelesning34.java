package Ukeoppgaver34;
import java.util.Arrays;
import java.util.Random;

public class forelesning34 {

    //metode som lager et array med unike, tilfeldige verdier
    public static int [] array(int lengde, int grense) {

        if (grense<lengde){
            throw new java.util.NoSuchElementException("grensen må være større eller lik lengden");
        }
        int[] a = new int[lengde]; //definerer array med lengde
        Random rand = new Random(); //gir tilfeldige verdier

        for (int i = 0; i < lengde; i++) {

            int tall = rand.nextInt(grense);
            int j = 0;

            //sjekker om tallet eksisterer fra før
            boolean eksisterer = false;
            while (j < i) {
                if (tall == a[j]) {
                    eksisterer = true;
                    j=i;
                } else {
                    j++;
                }
            }

            if (!eksisterer) { //legger til tallet om det ikke eksisterer
                a[i] = tall;
            } else{ //dersom tallet eksisterer minskes i med 1 for å finne en ny verdi.
                i--;
            }
        }
        return a;
    }

    //metode som returnerer største tall i et array
    public static int max(int[]a){
        int max=a[0];
        int endringer=0;

        for (int i=0; i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                endringer++;
            }
        }
        return max;
    }

    //metode som returnerer index til største tall i et halvåpent intervall
    public static int maks(int[]a, int f, int t){
        int max=a[f];
        int maxi=f;
        for(int i=f; i<t;i++){
            if (a[i]>max){
                max=a[i];
                maxi=i;
            }
        }
        return maxi;
    }

    //metode som bytter plass på to tall
    public static void bytt(int[]a,int i, int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    //main-metoden
    public static void main(String[] args) {

        int[] a = array(10,10);
        //skriver ut array før sortering
        System.out.println(Arrays.toString(a));

        //sorterer arrayet MEN trenger litt fix
        for (int k = a.length-1; k > 0; k--) {
            int max = maks(a, 0, k);
            bytt(a,k, max);
        }

        //skriver ut array etter sortering
        System.out.println(Arrays.toString(a));

    }
}
