package com.mycompany.tokoonline;

import java.util.ArrayList;

public class Karyawan implements User {

    private ArrayList<String> namaKaryawan =new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();


    public Karyawan() {

        this.namaKaryawan.add("Admin 1");
        this.alamat.add("Malang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);

        this.namaKaryawan.add("Admin 2");
        this.alamat.add("Surabaya");
        this.telepon.add("0811125656865");
        this.jabatan.add(0);

    }

    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int Id){
        return this.jabatan.get(Id);
    }
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String namaKaryawan ){
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat ){
        this.namaKaryawan.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.namaKaryawan.add(telepon);
    }

    @Override
    public String getNama(ArrayList<Integer> IdMember) {
        return null;
    }


    public String getNama(int IdKaryawan){
        return this.namaKaryawan.get(IdKaryawan);
    }

    @Override
    public String getAlamat(int IdKaryawan){
        return this.alamat.get(IdKaryawan);
    }

    @Override
    public String getTelepon(int IdKaryawan){
        return this.telepon.get(IdKaryawan);
    }

}
