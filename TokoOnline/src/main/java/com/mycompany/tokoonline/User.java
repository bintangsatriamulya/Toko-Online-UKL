/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tokoonline;

import java.util.ArrayList;

/**
 *
 * @author BINTANX KUN
 */
public interface User {

    public void setNama(String nama);
    public  void setAlamat(String alamat);
    public void setTelepon(String telepon);


    public  String getNama(ArrayList<Integer> IdMember);

    String getNama(int IdKaryawan);

    public  String getAlamat(int Id);
    public String getTelepon(int Id);
}
