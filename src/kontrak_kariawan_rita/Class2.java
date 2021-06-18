package kontrak_kariawan_rita;

import kariawan_rita.Class1;

public class Class2 extends Class1 {
    //pembuatan 3 atribut
    public String bidang;
    public int join,kontrak;

    //method
    public void Bidang(){
        System.out.println(nama+" memiliki keahliah di bidang "+bidang);
    }
    public void masaKerja(){
        System.out.println("Masa Kerja "+nama+" akan berakhir pada tahun "+(join + kontrak));
    }

    public static void main(String[] args) {
        Class2 Resa = new Class2();
        Resa.id = "002";
        Resa.nama = "Resa Damayanti";
        Resa.alamat = "Bangkal Banjarbaru";
        Resa.tanggal_lahir = "19 Desember 2004";
        Resa.gender = "Perempuan";
        Resa.masuk = 15;
        Resa.bidang = "Busana Butik";
        Resa.join = 2019;
        Resa.kontrak = 5;

        Resa.Desc();
        Resa.Alamat();
        Resa.Gajih();
        Resa.infoAbsen();
        Resa.Bidang();
        Resa.masaKerja();
    }
}
