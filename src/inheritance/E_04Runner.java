package inheritance;

public class E_04Runner {
     /*
            Bir obje olusturulurken
            Data turu ve constructor ayni class'dan ise
            variable'larin hangi degeri alacagini bulmak icin
            ilgili class'a gidip aramaya baslariz
            parent class'lara dogru aramaya devam ederiz
            ilk buldugumuz yani en guncel olan deger
            gecerli deger olur.

            Java bir objenin data turu olarak
            constructor'in oldugu class
            veya parent class'lari kabul eder

            Eger data turu, constructor'in parent'i ise
            aramaya DATA TURUnun oldugu class'dan baslanir
            parent class'lara dogru aramaya devam edilir
            ilk bulunan deger kullanilir
         */
     public static void main(String[] args) {
         E_03SarmanKediler obj = new E_03SarmanKediler();

         System.out.println(obj.hareket); // S yuruyerek hareket ederler
         System.out.println(obj.solunum); // K Akcigerleriyle
         System.out.println(obj.cogalma); // K doğurarak
         System.out.println(obj.yarammazliklvl); //Cok yaramazlar




         E_02Kediler obj2= new  E_03SarmanKediler();
         System.out.println(obj2.hareket); // K yururler
         System.out.println(obj2.solunum) ; // K Akcigerleriyle
         System.out.println(obj2.cogalma); // K doğurarak

         System.out.println(obj2.pence); // Penceleri yoktur
         System.out.println(obj2.pati); // patililerdir


 E_01Hayvanlar kedi3=new E_03SarmanKediler();
       //  System.out.println ( kedi3.beslenme);
        //  System.out.println(kedi3.hareket);
          // System.out.println(kedi3.cogalma);


     }





}
