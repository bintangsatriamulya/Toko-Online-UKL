package com.mycompany.tokoonline;

import java.util.ArrayList;

public class Barang{
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("SilverQueen");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Roma Gandum");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("UltraMilk");
        this.stok.add(50);
        this.harga.add(5500);
    }

    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int IdBarang){
        return this.namaBarang.get(IdBarang);
    }

    public void setStok(int stok ){
        this.stok.add(stok);
    }
    public int getStok(int IdBarang){
        return this.stok.get(IdBarang);
    }
    public void editStok(int IdBarang, int stok){
        this.stok.set(IdBarang, stok);;
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int IdBarang){
        return this.harga.get(IdBarang);
    }

}
