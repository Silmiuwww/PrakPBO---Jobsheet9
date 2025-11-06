package InterfaceLatihan;
public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int jumlahPintu, double harga, String warna, String merk, int volume) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return "SmartFridge - Volume: " + volume + " | " + super.getInfo();
    }
}
