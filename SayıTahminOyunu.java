import java.util.Random;
import java.util.Scanner;
public class SayıTahminOyunu {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int hak=5; 
		int n = new Random().nextInt(1000);
		int sayi=0;
		
		do {
			System.out.print("\n" +hak+ " hak kaldı.Sayı Giriniz :");
			sayi=scn.nextInt();
			if(n>sayi) {
				System.out.print("Sayıyı Yükseltin ");
				hak--;
			}
			else if(n<sayi){
				System.out.print("Sayıyı Küçültünüz ");
				hak--;
			}
			else {
				System.out.print("\nTebrikler. " +(5-hak+1)+" tahminde buldunuz ");
				break;
			}
			if(hak<=0) {
				System.out.print("\nKaybettiniz!\n ");
				System.out.println("Tutulan sayı = " +n);
		    }
		
		}while(hak>0);
		
		
		
		

	}

}
