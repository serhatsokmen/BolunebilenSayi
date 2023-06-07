import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n,toplam=0,sayac=0;
        double ortalama;
        System.out.print("herhangi bir pozitif tamsayi giriniz : ");
        n = scan.nextInt();
        if(n < 0) {
            System.out.println("HATA! POZITIF TAMSAYI GIRMELISINIZ.");
        }
        else {
            for(int i=0;i<=n;i++) {
                System.out.println(+i);
                if(i % 3 == 0 && i % 4 == 0) {
                    toplam += i;
                    sayac++;
                }
            }
            System.out.println("0'dan girilen degere kadar 3 ve 4 ile tam bolunebilen sayilar : "+sayac);
            System.out.println("0'dan girilen degere kadar 3 ve 4 ile tam bolunebilen sayilarin toplami : "+toplam);
            ortalama = toplam/sayac;
            System.out.println("0'dan girilen degere kadar 3 ve 4 ile tam bolunebilen sayilarin ortalamasi : "+ortalama);
        }


    }
}