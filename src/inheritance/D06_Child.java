package inheritance;

public class D06_Child extends D05_Parent {

    D06_Child() {
        super();
        System.out.println("child paremetresiz calisti");

    }
        D06_Child(String str){
        super(5);
            System.out.println("Child class String");




        }
    D06_Child(int sayi){
        System.out.println("Child INT");


    }

    public static void main(String[] args) {
        D06_Child child1 =new D06_Child();
        D06_Child child2=new D06_Child("k");
        D06_Child child3=new D06_Child(15);
    }









}
