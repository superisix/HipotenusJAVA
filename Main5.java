import java.util.Scanner;

public class Main5 {
      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Bir sayı giriniz: ");
        a=scan.nextInt();
        System.out.println("Bir sayı daha giriniz: ");
        b=scan.nextInt();
        c=(a*a)+(b*b);
        System.out.println("Bu üçgenin hipotenüsü: " + c);5
    }
}
