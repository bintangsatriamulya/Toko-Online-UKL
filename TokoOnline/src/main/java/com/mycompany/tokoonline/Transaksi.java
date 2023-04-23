package com.mycompany.tokoonline;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> IdBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> IdMember = new ArrayList<Integer>();

    public Transaksi() {
        this.IdMember.add(0);
        this.IdBarang.add(2);
        this.banyak.add(5);

        this.IdMember.add(2);
        this.IdBarang.add(1);
        this.banyak.add(9);

        this.IdMember.add(1);
        this.IdBarang.add(0);
        this.banyak.add(4);

        this.IdMember.add(2);
        this.IdBarang.add(0);
        this.banyak.add(11);
    }

    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Belanja");

        System.out.println("Masukkan ID Member");
        int idMember = input.nextInt();
        System.out.println("Selamat datang " + member.getNama(IdMember));

        ArrayList<Integer> IdBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;

        do {
            System.out.println("Masukkan kode barang :");
            temp = input.nextInt();
            if (temp != 99) {
                IdBarang.add(temp);
                System.out.print(barang.getNamaBarang(IdBarang.get(i)) + "sebanyak : ");
                banyak.add(input.nextInt());
                i++;
            }
        } while (temp != 99);


        System.out.println("Transaksi belanja " + member.getNama(IdMember) + " sebagai berikut");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
        int total = 0;
        int x = IdBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * barang.getHarga(IdBarang.get(j));
            total += jumlah;

            System.out.println(barang.getNamaBarang(IdBarang.get(j))+"\t"+ IdBarang.get(j)+"\t"+ barang.getHarga(IdBarang.get(j))+"\t"+ jumlah);
            transaksi.setTransaksi(barang, idMember, IdBarang.get(j), banyak.get(j));


        }
        System.out.println("Total Belanja : "+total);
        member.editSaldo(idMember, member.getSaldo(idMember)-total);
    }
    public void setTransaksi(Barang barang, int IdMember, int IdBarang, int banyaknya){
        this.IdMember.add(IdMember);
        this.IdBarang.add(IdBarang);
        this.banyak.add(banyaknya);
        barang.editStok(IdBarang, barang.getStok(IdBarang)-banyaknya);
    }
    public int getIdBarang(int Id){
        return this.IdBarang.get(Id);
    }
    public int getBanyaknya(int Id){
        return this.banyak.get(Id);
    }
    public int getIdMember(int Id){
        return this.IdMember.get(Id);
    }
    public int getJmlTransaksi(){
        return this.IdMember.size();
    }


}