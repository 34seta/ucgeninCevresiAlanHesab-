import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, u;

        System.out.println("Üçgenin bir kanar 'a'uzunluğunu giriniz: ");
        a = scanner.nextDouble();
        System.out.println("Üçgenin bir kanar 'b'uzunluğunu giriniz: ");
        b = scanner.nextDouble();
        System.out.println("Üçgenin bir kanar 'c'uzunluğunu giriniz: ");
        c = scanner.nextDouble();
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        u = (a + b + c) / 2;

        System.out.println("Ucgenin cevresi(cm)= " + u + " cm");

        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double Alan;
        Alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));


        System.out.println("Ucgenin Alanı= " + Alan + " cm2");
    }
}