import java.util.Scanner;
public class NimToRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: "); //nama = "Ririn Dwi Arianti";
        String nama = input.nextLine();
        System.out.print("NIM : "); //nim = "12050120419";
        String nim = input.nextLine();

        Nim objNim = new Nim();
        objNim.setNim(nim);
        System.out.println("Jenjang Perndidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = 20"+objNim.getTahun());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorurut());
    }
}
