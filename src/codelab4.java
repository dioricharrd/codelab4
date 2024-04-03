import java.util.HashMap;
import java.util.Scanner;

public class codelab4 {
    public static void main(String[] args){
        HashMap<String, Integer> inventori = new HashMap<>();

        inventori.put("pensil", 50);
        inventori.put("buku", 35);
        inventori.put("penghapus", 25);

        System.out.println("inventori awal : " + inventori);

        inventori.put("pensil", inventori.get("pensil") + 20);

        inventori.remove("penghapus");

        System.out.println("inventori setelah update : " + inventori);

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan nama barang yang ingin dicari: ");
        String barang = scanner.nextLine();
        cariBarang(inventori, barang);
    }
    public static void cariBarang(HashMap<String, Integer> inventori,String barang){
        if (inventori.containsKey(barang)) {
            System.out.println("stok" + barang + ":" + inventori.get(barang) + " unit. ");

        } else {
            System.out.println("barang" + barang + " tidak tersedia di inventori. ");
        }
    }

}