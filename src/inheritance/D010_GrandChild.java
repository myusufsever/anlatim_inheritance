package inheritance;

public class D010_GrandChild extends D08_KChild{


    int sayi= 10 ;


int yas=23;

String mahalle="Yeni gun mahallesi";

String sokak=  " 1355";

    String memleket = "Ankara";
    String arkadas = "Reyhan";

    public  void method1(){
        System.out.println("GC method1");
    }
    public  void method3(){
        System.out.println("GC method3");
    }
    public  void method4(){
        System.out.println("GC method4");
    }

    public void runnerMethod(){
        int sayi=5;
   String  yolgecenhani= " Yol gecen";
        System.out.println(sayi);
        System.out.println(this.sayi); // 10
        System.out.println(super.sayi); // 25
        System.out.println(sinif); //8
        System.out.println(isim);//Ali Can
        System.out.println(yas); //23;
        System.out.println(tel); // "5356457060";
        System.out.println(this.sinif); //8
        System.out.println(this.mahalle);  // Yeni gun mahallesi
        System.out.println(this.adres); //Cankaya
        System.out.println(super.sinif); // 8
        System.out.println(super.isim); // Ali Can
        System.out.println(super.memleket); //konya
        System.out.println(yolgecenhani); //Yol Gecen *****
        this.method2(); //Parent method 2 calisti
        super.method2(); // parent method 2
        this.method3(); //Gc method 3


    }


    public static void main(String[] args) {
D010_GrandChild obj=new D010_GrandChild();

obj.runnerMethod();


    }














}




