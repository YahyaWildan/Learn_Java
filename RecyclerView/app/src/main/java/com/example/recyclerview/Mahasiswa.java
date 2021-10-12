package com.example.recyclerview;

public class Mahasiswa {
    int image;
    String nama, nim, kelas;

    public Mahasiswa(int image, String nama, String nim, String kelas) {
        this.image = image;
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
