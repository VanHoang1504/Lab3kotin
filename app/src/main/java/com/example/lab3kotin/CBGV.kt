package com.example.lab3kotin

public class CBGV (magv: String, hoten: String, tuoi: Int, quequan: String, var luongcung: Double, var luongthuong: Double, var tienphat: Double)
    : Nguoi(magv, hoten, tuoi, quequan)  {

    fun luongthuclinh () : Double{
        return luongcung + luongthuong - tienphat
    }

}