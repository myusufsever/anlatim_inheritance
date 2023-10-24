package inheritance;

public class D05_Parent extends D04_GrandParent {

    D05_Parent(){

        System.out.println("Parent parametresiz");
    }
    D05_Parent(String str){
        System.out.println("Parent string ");



    }
    D05_Parent (boolean bl ){
        System.out.println("Parent boolen");
    }
    D05_Parent (int sayi){

        System.out.println("Parent int ");
    }

}
