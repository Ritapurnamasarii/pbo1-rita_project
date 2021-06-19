package kontrak_kariawan_rita;

import kariawan_rita.Class1;

public class Class2 extends Class1 {
    //pembuatan 3 atribut
    private String bidang;
    private int join,kontrak;

    //method
    public void Bidang(){
        System.out.println(getNama()+" memiliki keahliah di bidang "+bidang);
    }
    public void masaKerja(){
        System.out.println("Masa Kerja "+getNama()+" akan berakhir pada tahun "+(join + kontrak));
    }

    //Setter
    public void setBidang(String bidang){
        this.bidang=bidang;
    }
    public void setJoin(int join){
        this.join=join;
    }
    public void setKontrak(int kontrak){
        this.kontrak=kontrak;
    }

    //Getter
    public String getBidang(){
        return bidang;
    }
    public int getJoin(){
        return join;
    }
    public int getKontrak(){
        return kontrak;
    }

    //overiding
    public void Gajih(){
        setGajih(getMasuk() * 2000000);
        System.out.println("kariawan "+getNama()+" mendapatkan gajih sebesar Rp "+getGajih()+" pada bulan ini");
    }
    public void Desc(){
        System.out.println("Kariawan "+getId()+" dengan nama lengkap "+getNama()+" lahir pada tanggal "+getTanggal_lahir()+" dengan kelamin "+getGender()+" Dan Berstatus sebagai kariawan KONTRAK" );
    }

}
