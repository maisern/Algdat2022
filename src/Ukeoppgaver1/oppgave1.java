package Ukeoppgaver1;

public class oppgave1 {
    public static void main(String[] args) {

        int[] arr = {2,4,5,3,9,2,7,5};
        System.out.println(min(arr));
    }

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
}