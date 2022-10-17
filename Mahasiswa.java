
public class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    public String getGrade(){
        if(getNilai() >= 80 && getNilai() <= 100){
            return "A (Lulus)";
        }
        else if(getNilai() >= 70 && getNilai() <=79){
            return "B (Lulus)";
        }
        else if(getNilai() >= 60 && getNilai() <= 69){
            return "C (Lulus)";
        }
        else if(getNilai() >= 50 && getNilai() <= 59){
            return "D (Tidak Lulus)";
        }
        else if(getNilai() >= 0 && getNilai() <= 49){
            return "E (Tidak Lulus)";
        }
        return "Input salah";
    }
    
    public void info(){
        System.out.println("------------------------------------------------");
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        System.out.println("Grade : "+getGrade());
    }
}
