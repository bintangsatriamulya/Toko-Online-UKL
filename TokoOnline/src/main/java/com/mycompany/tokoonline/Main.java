package com.mycompany.tokoonline;

public class Main {
    public static void main(String[] args) {

            Barang barang = new Barang();
            Karyawan karyawan = new Karyawan();
            Laporan laporan = new Laporan();
            Member member = new Member();
            Transaksi transaksi = new Transaksi();

        System.out.println();
        System.out.println("===============SELAMAT DATA DI NEKOSTORE===============");

            laporan.laporan(barang);
            laporan.laporan(member);
            laporan.laporan(transaksi,barang);

    }
}
