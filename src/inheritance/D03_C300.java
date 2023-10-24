package inheritance;

public class D03_C300 extends D02_JetUcaklar{

    String model="C300";

    String uretimYeri="Turkiye";

    String lastik="Lassa";

    String aku = "Yiğit akü ";

    String tekerCapti="19 inc";

    String guvenlik="bestcyber";

String silah="Mevcut";

    public static void main(String[] args) {

   D03_C300 uck1 = new D03_C300();
        System.out.println(uck1.model);
        System.out.println(uck1.aku); //yiğit
        System.out.println(uck1.marka);//challenger
        System.out.println(uck1.guvenlik); //bestcyber
        System.out.println(uck1.renk); //Renk atanmamis

    }
















}
