
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan info barang
 *                     antik.
 *  
 */

package pbo1.pkg10118033.latihan56;

public class PBO110118033Latihan56 {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : "+radio.getName());
        radio.tampilUmur();
    }
}