import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran= 0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün ücretini giriniz: ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar+tutar;
        System.out.println("Ürünün kdv'siz tutarı :"+tutar);
        System.out.println("Ürünün kdv tutarı : "+ kdvTutar);
        System.out.println("Ürünün kdv dahil tutarı : "+kdvliTutar);
    }
}