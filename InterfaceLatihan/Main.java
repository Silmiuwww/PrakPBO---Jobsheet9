package InterfaceLatihan;
public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Duduk", 250000.0, "Putih", "Miyako");
        TV tv = new TV("LED", 4000000.0, "Hitam", "Samsung", 10);
        SmartFridge sf = new SmartFridge(2, 12000000.0, "Abu-abu", "LG", 8);

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(sf.getInfo());

        System.out.println("\n--- Coba Ubah Volume ---");
        tv.naikkanVolume(3);
        sf.turunkanVolume(2);

        System.out.println(tv.getInfo());
        System.out.println(sf.getInfo());
    }
}
