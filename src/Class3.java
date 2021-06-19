import kariawan_rita.Class1;
import kontrak_kariawan_rita.Class2;

public class Class3 {

    public static void main(String[] args) {

        //pembutan Objek
        Class1 Rita = new Class1("001","Rita Purnamasari");
        Rita.setAlamat("Bangkal");
        Rita.setTanggal_lahir("05 September 2001");
        Rita.setGender("Perempuan");
        Rita.setMasuk(19);
        Rita.Desc();
        Rita.Alamat();
        Rita.Gajih();
        Rita.infoAbsen();
        System.out.println();

        Class1 Resa = new Class1("002","Resa Damayanti");
        Resa.setAlamat("Bangkal Banjarbaru");
        Resa.setTanggal_lahir("18 Maret 2005");
        Resa.setGender("Perempuan");
        Resa.setMasuk(15);
        Resa.Desc();
        Resa.Alamat();
        Resa.Gajih();
        Resa.infoAbsen();
        System.out.println();

        Class1 Ervia = new Class1("003",20);
        Ervia.setNama("Ervia Putri");
        Ervia.setAlamat("Banjarbaru");
        Ervia.setTanggal_lahir("17 Agustus 2001");
        Ervia.setGender("Perempuan");
        Ervia.Desc();
        Ervia.Alamat();
        Ervia.Gajih();
        Ervia.infoAbsen();
        System.out.println();

        Class1 Riska = new Class1("004",10);
        Riska.setNama("Nur Riska");
        Riska.setAlamat("Loktabat Banjarbaru");
        Riska.setTanggal_lahir("31 Januari 2001");
        Riska.setGender("Perempuan");
        Riska.Desc();
        Riska.Alamat();
        Riska.Gajih();
        Riska.infoAbsen();
        System.out.println();

        Class1 Annor = new Class1(2,"Muhammad Annor");
        Annor.setId("005");
        Annor.setAlamat("Amuntai");
        Annor.setTanggal_lahir("2 Juli 2001");
        Annor.setGender("Laki-Laki");
        Annor.Desc();
        Annor.Alamat();
        Annor.Gajih();
        Annor.infoAbsen();
        System.out.println();

        Class1 Habibi = new Class1(5,"Ahmad Habibi");
        Habibi.setId("006");
        Habibi.setAlamat("Pengaron");
        Habibi.setTanggal_lahir("25 Februari 2000");
        Habibi.setGender("Laki-Laki");
        Habibi.Desc();
        Habibi.Alamat();
        Habibi.Gajih();
        Habibi.infoAbsen();
        System.out.println();


        //Objek Class2
        Class2 Fahmi = new Class2();
        Fahmi.setId("007");
        Fahmi.setNama("Hafizhol Fahmi");
        Fahmi.setAlamat("Sungai Sipai");
        Fahmi.setTanggal_lahir("16 Januari 2001");
        Fahmi.setGender("Laki-Laki");
        Fahmi.setMasuk(7);
        Fahmi.setBidang("Tekhnik Informatika");
        Fahmi.setJoin(2019);
        Fahmi.setKontrak(50);
        Fahmi.Desc();
        Fahmi.Alamat();
        Fahmi.Gajih();
        Fahmi.infoAbsen();
        Fahmi.Bidang();
        Fahmi.masaKerja();
        System.out.println();


    }
}
