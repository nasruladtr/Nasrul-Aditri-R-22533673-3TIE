public class Lingkaran extends ObjekGeometri {

    Lingkaran(int jumlahSisi) {
       super(jumlahSisi);
    }
    @Override
    public void displayBangun(){
        System.out.println("Warna Bangun ini adalah "+super.getColor());
        System.out.println("Jumlah Sisi Bangun ini adalah"+jumlahSisi);
    }
}