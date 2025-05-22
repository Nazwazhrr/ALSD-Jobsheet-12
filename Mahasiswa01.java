public class Mahasiswa01{
    public String nim;
    public String nama;
    public String kelas;
    public double  ipk;

    public Mahasiswa01(String nim, String nama, String kelas, double  ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", kelas: " + kelas +", IPK:" + ipk);
    }
}