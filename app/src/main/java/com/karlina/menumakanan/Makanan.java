package com.karlina.menumakanan;

public class Makanan {

    private String nama;
    private String desc;
    private int harga;
    private int gambar;

    public Makanan(String nama, String desc, int harga, int gambar) {
        this.nama = nama;
        this.desc = desc;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }


}
