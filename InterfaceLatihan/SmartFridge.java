package InterfaceLatihan;

public class SmartFridge extends Kulkas {
    private int volume;

    public SmartFridge(int jumlahPintu, double harga, String warna, String merk, int volume) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }
}
