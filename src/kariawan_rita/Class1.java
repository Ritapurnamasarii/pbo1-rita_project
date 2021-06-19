package kariawan_rita;

public class Class1 {
    //pembuatan 8 atribut
    public String id, nama, alamat, tanggal_lahir, gender;
    public int masuk,absen;
    public long gajih;

    //construktor
    public Class1(){

    }
    public Class1(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    public Class1(String id, int masuk){
        this.id = id;
        this.masuk = masuk;
    }
    public Class1(int masuk, String nama){
        this.masuk = masuk;
        this.nama = nama;
    }


    //method
    public void Alamat(){
        System.out.println("Alamat kariawan "+nama+" bertempat di "+alamat);
    }
    public void Desc(){
        System.out.println("Kariawan "+id+" dengan nama lengkap "+nama+" lahir pada tanggal "+tanggal_lahir+" dengan kelamin "+gender );
    }
    public void Gajih(){
        gajih = masuk * 800000;
        System.out.println("kariawan "+nama+" mendapatkan gajih sebesar Rp "+gajih);
    }
    public void infoAbsen(){
        absen = 20 - masuk;
        System.out.println(nama+" absen "+absen+" hari pada bulan ini");
    }


}
