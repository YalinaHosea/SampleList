package com.example.samplelist.Model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String gender;
    private String hobi;
    private String cita_cita;
    private String moto;
    private int foto;

    public Mahasiswa(String nim, String nama, String gender, String hobi, String cita_cita, String moto, int foto) {
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.hobi = hobi;
        this.cita_cita = cita_cita;
        this.moto = moto;
        this.foto = foto;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getCita_cita() {
        return cita_cita;
    }

    public void setCita_cita(String cita_cita) {
        this.cita_cita = cita_cita;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
