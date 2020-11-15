package latihan.CetakNama;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        System.out.println("=====Aplikasi Pencetakan Nama======");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak berapa kali ? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer1.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
