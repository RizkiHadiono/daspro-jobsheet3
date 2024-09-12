import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tarif = 1500;
        
        System.out.print("Penggunaan listrik: ");
        int penggunaan = sc.nextInt();

        double biaya = penggunaan * tarif;

        System.out.print("Tarif yang harus dibayar : " + biaya);
   
        if (penggunaan > 500) {
            System.out.println("Penggunaan anda lebih dari 500 kWh");
        }
        else {
            System.out.println("Penggunaan anda kurang dari 500 kWh");
        }

    }
}