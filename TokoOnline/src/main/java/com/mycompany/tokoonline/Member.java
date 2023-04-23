package com.mycompany.tokoonline;

import java.util.ArrayList;

public class Member implements  User{
    private ArrayList<String> namaMember = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Integer> saldo = new ArrayList<>();

    public Member(){
        this.namaMember.add("Rusdi");
        this.alamat.add("Ngawi");
        this.telepon.add("088212345678");
        this.saldo.add(100000);

        this.namaMember.add("Kevin");
        this.alamat.add("Bogor");
        this.telepon.add("088122288883");
        this.saldo.add(250000);

        this.namaMember.add("Jenny");
        this.alamat.add("Jakarta");
        this.telepon.add("088239897898");
        this.saldo.add(350000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }
    public int getSaldo(int IdMember){
        return this.saldo.get(IdMember);
    }
    public  void editSaldo(int IdMember,int saldo){
        this.saldo.set(IdMember,saldo);
    }
    public  int getJmlMember(){
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);

    }

    @Override
    public String getNama(ArrayList<Integer> IdMember) {
        return null;
    }

    @Override
    public String getNama(int IdMember) {
        return this.namaMember.get(IdMember);
    }

    @Override
    public String getAlamat(int IdMember) {
        return this.alamat.get(IdMember);
    }

    @Override
    public String getTelepon(int IdMember) {
        return this.telepon.get(IdMember);
    }
}



