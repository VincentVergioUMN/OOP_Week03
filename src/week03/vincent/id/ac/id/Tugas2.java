package week03.vincent.id.ac.id;

import java.util.Scanner;
public class Tugas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();

        System.out.println("\nString anda : " + nama);
        System.out.println("--------------------------");
        System.out.println("1. charAt");
        System.out.println("2. length");
        System.out.println("3. substring(n)");
        System.out.println("4. substring(m,n)");
        System.out.println("5. contains");
        System.out.println("6. concat");
        System.out.println("7. replace");
        System.out.println("8. split");
        System.out.println("9. lowerCase");
        System.out.println("10. upperCase");
        System.out.print("Pilih menu : ");
        int menu = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        switch (menu) {
            case 1:
                System.out.println("-----charAt-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                int index = scanner.nextInt();
                System.out.println("Hasil : " + nama.charAt(index));
                break;

            case 2:
                System.out.println("-----length-----");
                System.out.println("Nama : " + nama);
                System.out.println("Hasil : " + nama.length());
                break;

            case 3:
                System.out.println("-----substring(n)-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                int start = scanner.nextInt();
                System.out.println("Hasil : " + nama.substring(start));
                break;

            case 4:
                System.out.println("-----substring(m,n)-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input mulai : ");
                int m = scanner.nextInt();
                System.out.print("Input akhir : ");
                int n = scanner.nextInt();
                System.out.println("Hasil : " + nama.substring(m, n));
                break;

            case 5:
                System.out.println("-----contains-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                String contains = scanner.nextLine();
                System.out.println("Hasil : " + nama.contains(contains));
                break;

            case 6:
                System.out.println("-----concat-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                String tambahan = scanner.nextLine();
                System.out.println("Hasil : " + nama.concat(tambahan));
                break;

            case 7:
                System.out.println("-----replace-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input kata yang diganti : ");
                String lama = scanner.nextLine();
                System.out.print("Input kata pengganti : ");
                String baru = scanner.nextLine();
                System.out.println("Hasil : " + nama.replace(lama, baru));
                break;

            case 8:
                System.out.println("-----split-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                String delimiter = scanner.nextLine();
                String[] hasilSplit = nama.split(delimiter);
                for (String h : hasilSplit) {
                    System.out.println("Hasil : " + h);
                }
                break;

            case 9:
                System.out.println("-----lowerCase-----");
                System.out.println("Nama : " + nama);
                System.out.println("Hasil : " + nama.toLowerCase());
                break;

            case 10:
                System.out.println("-----upperCase-----");
                System.out.println("Nama : " + nama);
                System.out.println("Hasil : " + nama.toUpperCase());
                break;

            default:
                System.out.println("Menu tidak tersedia.");
        }
    }
}
