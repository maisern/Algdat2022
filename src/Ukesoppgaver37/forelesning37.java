package Ukesoppgaver37;

public class forelesning37 {

    public static void main(String[] args) {
        for(int i=0;i<1;i++){
            System.out.println(simpleIntervalCheck(i));
            System.out.println(ternaryIntervalCheck(i));
        }

        Character [] b= {'b','f', 'w'};
        System.out.println(maks(b));

        String[] s={"A" + "er" + "kjempe"};
        System.out.println(maks(s));

        Pokemon[] pokemons = {
                new Pokemon("pikachu", 34, 100),
                new Pokemon("Bulbasor", 2, 90),
                new Pokemon("Onix", 34,100)
        };

        System.out.println();
        System.out.println("Jeg velger: ");

        for ( Pokemon p: pokemons){
            System.out.println(p);

        }
        System.out.println(pokemons[maks(pokemons)]+ " Jeg velger deg");
    } //main


    public static int simpleIntervalCheck(int x){
        if(x<0){
            return -1;
        }else{
            return 1;
        }
    }

    public static int ternaryIntervalCheck(int x){
        return (x < 0) ? -1 : 1;
    }


    // alle klasser som kan sammenliknes
    public static <T extends Comparable<? super T>>int maks(T[]x){

        T max=x[0];
        int m=0;
        for (int i=1; i<x.length;i++){
            if (x[i].compareTo(max)>0){
                max=x[i];
                m=i;
            }
        }

        return m;
    }

    public static class Pokemon implements Comparable<Pokemon>{
        String name;
        Integer level;
        Integer hp;

        Pokemon(String name, int level, int hp) {
            this.name = name;
            this.level =level;
            this.hp=hp;
        }

        public String toString(){
            return this.name + "(" + level +", "+ hp +")";
        }

        public int compareTo(Pokemon otherPokemon){
            int out = this.level.compareTo(otherPokemon.level);
            if(out==0){
                out = this.hp.compareTo(otherPokemon.hp);
            }
            if (out==0){
                out=this.name.compareTo(otherPokemon.name);
            }
          return out;

        }
    }
}

