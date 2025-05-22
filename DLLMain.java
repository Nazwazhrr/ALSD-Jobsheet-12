import java.util.Scanner;
public class DLLMain {
        public static void main(String[] args) {
            DoubleLinkedList01 list = new DoubleLinkedList01();
            Scanner scan = new Scanner(System.in);
            int pilihan;

            do { 
                System.out.println("\nMenu Double Linked List Mahasiswa");
                System.out.println("1. Tambah di awal");
                System.out.println("2. Tambah di akhir");
                System.out.println("3. Hapus dari awal");
                System.out.println("4. Hapus dari akhir");
                System.out.println("5. Tampilkan data");
                System.out.println("6. Cari Mahasiswa berdasarkan NIM");
                System.out.println("7. Sisip data setelah NIM tertentu");
                System.out.println("8. Tambah data pada indeks tertentu");
                System.out.println("9. Hapus data setelah NIM tertentu");
                System.out.println("10. Hapus data pada indeks tertentu");
                System.out.println("11. Tampilkan data pertama");
                System.out.println("12. Tampilkan data terakhir");
                System.out.println("13. Tampilkan data pada indeks tertentu");
                System.out.println("14. Tampilkan jumlah data");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu : ");
                pilihan = scan.nextInt();

                switch (pilihan) {
                    case 1 -> {
                        Mahasiswa01 mhs = inputMahasiswa(scan);
                        list.addFirst(mhs);
                    }
                    case 2 -> {
                        Mahasiswa01 mhs = inputMahasiswa(scan);
                        list.addLast(mhs);
                    }
                    case 3 -> list.removeFirst();
                    case 4 -> list.removeLast();
                    case 5 -> list.print();
                    case 6 -> {
                        System.out.print("Masukkan NIM yang dicari: ");
                        scan.nextLine(); 
                        String nim = scan.nextLine();
                        Node01 found = list.search(nim);
                        if (found != null) {
                            System.out.println("Data ditemukan");
                            found.data.tampil();
                        } else {
                            System.out.println("Data tidak ditemukan");
                        }
                    }
                    case 7 -> {
                        System.out.print("Masukkan NIM sebelum data baru disisipkan: ");
                        scan.nextLine(); 
                        String keyNim = scan.nextLine();
                        Mahasiswa01 mhs = inputMahasiswa(scan);
                        list.insertAfter(keyNim, mhs);
                    }
                    case 8 -> {
                        System.out.print("Masukkan indeks: ");
                        int index = scan.nextInt();
                        scan.nextLine();
                        Mahasiswa01 mhs = inputMahasiswa(scan);
                        list.add(index, mhs);
                    }
                    case 9 -> {
                        scan.nextLine();
                        System.out.print("Masukkan NIM sebagai acuan penghapusan: ");
                        String key = scan.nextLine();
                        list.removeAfter(key);
                    }
                    case 10 -> {
                        System.out.print("Masukkan indeks yang ingin dihapus: ");
                        int index = scan.nextInt();
                        list.remove(index);
                    }
                    case 11 -> list.getFirst();
                    case 12 -> list.getLast();
                    case 13 -> {
                        System.out.print("Masukkan indeks: ");
                        int index = scan.nextInt();
                        list.getIndex(index);
                    }
                    case 14 -> { 
                        System.out.println("Jumlah data dalam list: " + list.size());
                    }
                    case 0 -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 0);

            scan.close();
        }
    
    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        scan.nextLine(); 
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}