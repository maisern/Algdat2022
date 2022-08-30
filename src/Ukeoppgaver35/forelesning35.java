package Ukeoppgaver35;

import java.util.Arrays;

public class forelesning35 {
    public static void main(String[] args) {
        int[]a={1,5,2,8};

        int[]mnm = maxNmax(a);
        System.out.println("Største tall på index: " + mnm[0] + "\nNest største tall på index: " + mnm[1]);

    }

    public static int[] binery(int[]a,int begin){

        for (int i=begin; i>0;i--){
            int left = 2*i;
            int right = 2*i+1;
            if (a[left]>a[right]){
                a[i]= a[left];
            }else{
                a[i]=a[right];
            }

        }
        return a;
    }

    //finner største og nest største vedi ved bruk av maks og bytt
public static int[]maxNmax(int[]a){

        int max=Tabell.maks(a);
        Tabell.bytt(a,max,a.length-1);
        int nmax=Tabell.maks(a,0,a.length-1);

        if(max==nmax){
            max=a.length-1;
        }
        Tabell.bytt(a,max,a.length-1);

        return new int[]{max, nmax};
}



}
