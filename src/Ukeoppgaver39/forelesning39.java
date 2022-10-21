package Ukeoppgaver39;

import java.util.Arrays;

public class forelesning39 {
    public static void main(String[] args) {

        int[] a = {0, 1, 1, 2, 3, 5, 8};
        int[] y = Arrays.copyOf(a, a.length + 1);
        y[y.length-1] = 13;
    }
    /*

    public static class Node{
        int verdi;
        Node next;
        Node prev;

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(1);


        //legge til node på starten
        n = new Node(32);
        n.next = head;
        head=n;

        //legge til node på slutten
        public static void slutt() {

            n = new new Node(32);
            Node siste = iterer til slutten
            siste.next = n;
            n.next = null;
        }

        //legge til mellom to noder

        public static void insert(Node p, Node q, Node r){
            p.next=q;
            q.next=r;

        }
        public static void remove (Node p, Node q, Node r){
            p.next=r;
            r.prev=p;
        }
        //på oblig: Fjerning av første/siste node


    }

    //hente node i inddeks k rekursivt
    Node get(int k){//rekursiv versjon
        if (k==0){//basistilfelle
            return this;
        }else{
            return this.get(k-1);//enklere kall
        }
    }

    //hente node i indeks k itterativt
    Node get(Node head, int k) {
        Node current = head;
        for (int i = 0; i < k; i++) {
            current = current.next;
        }
        return current;
    }

     */


}
