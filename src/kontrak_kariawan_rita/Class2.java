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

}
