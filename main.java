import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("yüksekliği giriniz= ");
        int a = scn.nextInt();
        System.out.println("tabanı giriniz= ");
        int b = scn.nextInt();
        double H = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs =" + H);
    }
}
