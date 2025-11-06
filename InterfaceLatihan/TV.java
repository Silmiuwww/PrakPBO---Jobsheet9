package InterfaceLatihan;
public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public TV(String jenisLayar, double harga, String warna, String merk, int volume) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
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

    @Override
    public String getInfo() {
        return "TV " + jenisLayar + " - Volume: " + volume + " | " + super.getInfo();
    }
}