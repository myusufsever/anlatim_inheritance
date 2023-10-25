package inheritance;

public class F_04Runner {

      /*

           Ozellikler method olarak olusturulmussa

                -constructor ve data turu ayni ise
                 o class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                 ilk buldugumuz method calistirilir

                 -constructor ve data turu ayni degil ise
                  data turu olan class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                  eger method bulunursa, hemen calistirilmaz
                  o method'un constructor olan class'a kadar daha gunceli var mi kontrol edilir
                  daha guncel varsa guncel olan calisir

                   aramaya basladigimiz class'da ve parent class'larinda method bulunamazsa
                   child class'lara donulmez, guncel var mi bakilmaz
                   CTE olusur

         */
      public static void main(String[] args) {
          F_03SarmanKediler kedi1=new F_03SarmanKediler();
          kedi1.hareket(); // F03 Sarman yururler
          kedi1.solunum(); // F02 Akcigerleriyle nefes alırlar
kedi1.beslenme();  //  F03 Sarman  mama yerler
          kedi1.cogalma(); // Doğurarak cogalirlar


          F_02Kediler kedi2=new F_03SarmanKediler();
kedi2.hareket();
          kedi2.beslenme(); // F01 Sarman kediler  mama yerler beslenirler
          kedi2.solunum(); // Akcigerle nefes alırlar
kedi2.cogalma(); //Doğurarak cogalırlar
          kedi2.dis(); // F02 Kediler disleri vardir
           // kedi2.tuyler

          F_01Hayvanlar kedi3=new F_03SarmanKediler();

          kedi3.hareket(); // F03_ Sarman kediler yururler
          kedi3.solunum(); // F02 Kediler akcigerler
          // kedi3.tuyler






      }














}
