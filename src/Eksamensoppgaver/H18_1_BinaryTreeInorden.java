package Eksamensoppgaver;

public class H18_1_BinaryTreeInorden {

    /**
     * Klasse som representerer en node i et binærtre
     * left_child er venstre barn til denne noden
     * right_child er høyre barn til denne noden
     * value er verdien denne noden holder
     */
    public static class BTNode {
        BTNode left_child;
        BTNode right_child;
        char value;

        /**
         * Konstruktør som lager en ny node
         * @param value Verdien dene noden skal ha
         */
        BTNode(char value) {
            this.value = value;
        }

        /**
         * Legger til en ny verdi i det binære treet
         * @param value Verdien å legge til
         */
        void add(char value) {
            if (value < this.value) {
                if (this.left_child != null) {
                    this.left_child.add(value);
                }
                else {
                    this.left_child = new BTNode(value);
                }
            }
            else {
                if (this.right_child != null) {
                    this.right_child.add(value);
                }
                else {
                    this.right_child = new BTNode(value);
                }
            }
        }

        /**
         * Skriver ut inorden ved hjelp av rekursjon
         */


        //når metoden ikke tar inn en node
        public void printInOrder(){
            if(this.left_child!=null) {
                this.left_child.printInOrder();
            }
            System.out.print(this.value); //siden det er in-orden

            if(this.right_child != null) {
                this.right_child.printInOrder();
            }
        }
    }

    public static void main(String[] args) {
        BTNode root = new BTNode('F');
        char values[] = "CIADHJBEG".toCharArray();

        for (char val : values) {
            root.add(val);
        }
        root.printInOrder();
    }
}
