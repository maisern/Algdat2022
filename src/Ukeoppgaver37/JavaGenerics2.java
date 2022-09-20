package Ukeoppgaver37;

import java.util.Arrays;

public class JavaGenerics2 {

    public static void main(String[] args) {

        Integer[]x={12,3,45,9,99,0,6,8};

        //TestKomparator cmp = new TestKomparator();

        JavaGenerics2.Pokemon[] pokemons = {
                new JavaGenerics2.Pokemon("pikachu", 34, 100),
                new JavaGenerics2.Pokemon("Bulbasor", 2, 90),
                new JavaGenerics2.Pokemon("Onix", 34, 100)
        };
        for (Pokemon p:pokemons){
            System.out.println(p);
        }

        StigendePokemonKomparator cmp = new StigendePokemonKomparator();
        System.out.println(cmp.compare(pokemons[0], pokemons[1]));

        //System.out.println(pokemons, cmp));

        Integer[] a ={43,4,6,3,656,5};
        OddetallPartallKomparator cmpOP = new OddetallPartallKomparator();
        System.out.println(cmpOP.compare(a[0],a[4]));
        System.out.println(Arrays.toString(a));


    }


    @FunctionalInterface
    public interface Komparator <T>{

        int compare(T x,T y);
    }

    public static class SynkendePokemonKomparator implements Komparator<Pokemon> {
        public int compare(Pokemon p1, Pokemon p2) {
            int out = p2.lvl.compareTo(p1.lvl);
            if (out == 0) {
                out = p2.hp.compareTo(p1.hp);
                if (out == 0) {
                    out = p2.navn.compareTo(p1.navn);
                }
            }
            return out;
        }
    }


    public static class StigendePokemonKomparator implements Komparator<Pokemon> {
        public int compare(Pokemon p1, Pokemon p2) {
            int out = p1.lvl.compareTo(p2.lvl);
            if (out == 0) {
                out = p1.hp.compareTo(p2.hp);
                if (out == 0) {
                    out = p1.navn.compareTo(p2.navn);
                }
            }
            return out;
        }
    }


    // fungerer ikke enda
    public static class OddetallPartallKomparator implements Komparator<Integer>{
        public int compare(Integer x, Integer y){
            int out=0;
            if (x%2 ==0 & y%2 ==0){
                out=x.compareTo(y);
            }else if(x%2 ==1 & y%2 ==1) {
                out=x.compareTo(y);
            }else if(x%2 ==0 & y%2 ==1) {
                out=x.compareTo(y);
            }else if(x%2 ==1 & y%2 ==0) {
                out=x.compareTo(y);
            }
            return out;
        }
    }


    public static class Pokemon{
        String navn;
        Integer lvl;
        Integer hp;

        Pokemon(String navn, Integer lvl, Integer hp){
            this.navn =navn;
            this.lvl = lvl;
            this.hp = hp;

        }

        public String toString(){
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
    }


    // maksmetode som fungerer for alle datatyper som støtter copareble (f.eks. Integer ikke int)
    public static <T> int maks(T[] x, int fra, int til, Komparator<T>cmp) {

        T max = x[0];
        int m = fra;
        for (int i = fra+1; i <til; i++) {
            if (cmp.compare(x[i],max) > 0) {
                max = x[i];
                m = i;
            }
        }
        return m;
    }


    public static <T> void indeksSortering (T[]x , Komparator<T> cmp){
        for (int i= x.length-1; i>0;i--){
            int m= maks(x,0,i+1, cmp);
            bytt(x,m,i);
        }
    }

    public static <T> void bytt (T[]x,int fra, int til){
        T temp = x[fra];
        x[fra]=x[til];
        x[til]=temp;
    }



}
