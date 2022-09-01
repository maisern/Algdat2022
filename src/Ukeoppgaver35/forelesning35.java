package Ukeoppgaver35;

import java.util.Arrays;

public class forelesning35 {
    public static void main(String[] args) {

       int[]a = {0,0,0,0,0,5,7,31,13,8};
       int begin=4;

       for(int i =begin ; i>0;i--){
           int lChild = a[i*2];
           int rChild = a[i*2+1];
           a[i] = Math.max(lChild, rChild);
       }

        System.out.println(Arrays.toString(a));
    }


     int parent(int id){
        return id/2;
     }

     int sibling(int id) {
         if (2 * parent(id) == id) {
             return id + 1;
         } else {
             return id - 1;
         }
     }

     int uncle(int id){
        return sibling(parent(id));
     }

     int grandparent(int id){
        return parent(parent(id));
     }




    public static int[] binary(int[]a,int begin){

        for (int i=begin; i>0;i--){
            int left = 2*i;
            int right = 2*i+1;
            a[i] = Math.max(a[left], a[right]);

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
