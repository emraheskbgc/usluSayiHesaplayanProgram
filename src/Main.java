import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, upNumber;

        System.out.print("Lütfen üssü alınacak sayıyı giriniz = ");
        number = input.nextInt();
        System.out.print("Lütfen üs olacak sayıyı giriniz = ");
        upNumber = input.nextInt();
        int i = 1;
        int total = 1;
        while (i <= upNumber){
            total *= number;
            i++;
        }
        System.out.println("Cevap = " + total);

    }
}
