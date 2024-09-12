import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float nilaiBonus = 10/100f;
        float nilaiPajak = 5/100f;

        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();
        System.out.print("Masukan upah per jam: ");
        double upah = input.nextDouble();

        double totalGaji = jamKerja * upah;
        double gajiBonus = (totalGaji * nilaiBonus) + totalGaji;
        double pajak = gajiBonus * nilaiPajak;
        double gajiAkhir = gajiBonus - pajak;
        
        System.out.println("Gaji akhir setelah bonus dan pajak : Rp " + gajiAkhir);


    }

}