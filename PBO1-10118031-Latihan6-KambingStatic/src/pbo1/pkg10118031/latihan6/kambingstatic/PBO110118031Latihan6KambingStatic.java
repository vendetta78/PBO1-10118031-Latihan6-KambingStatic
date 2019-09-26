package pbo1.pkg10118031.latihan6.kambingstatic;

/**
 *
 * @author Vendetta
 * NAMA              : Rizki Aria Putra
 * KELAS             : PBO1
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk
 *                     variabel Static & Konstanta
 */
public class PBO110118031Latihan6KambingStatic {

    //Variabel jumlahKaming dideklarasikan sebagai statik
    public static int jumlahKambing;
}

class KambingStatic {
    //NAMA_KAMBING sebagai konstanta

    public static final String NAMA_KAMBING = "MIDUN ";

    public static void main(String[] args) {
        PBO110118031Latihan6KambingStatic.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing "
                + PBO110118031Latihan6KambingStatic.jumlahKambing);
    }

}
