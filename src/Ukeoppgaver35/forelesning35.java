package Ukeoppgaver35;

import java.util.Arrays;

public class forelesning35 {
    public static void main(String[] args) {
        int[]a={0,0,0,4,9,6};
        System.out.println(Arrays.toString(binery(a,2)));

    }

    public static int[] binery(int[]a,int begin){

        for (int i=begin; i>0;i--){
            int id =i;
            int left = 2*id;
            int right = 2*id+1;
            if (a[left]>a[right]){
                a[id]= a[left];
            }else{
                a[id]=a[right];
            }

        }
        return a;
    }
}
