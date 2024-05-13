package com.example.lab3kotin

fun main(){
    val soA : Int? = 5
    val soB : Int? = 10
    val tong = tinhTong(soA!!, soB!!)
    println("tong 2 so $soA va $soB = $tong")
    val hieu = tinhHieu(soA!!, soB!!)
    println("Hiệu 2 số $soA va $soB = $hieu")

    println("bình thương $soA = ${binhPhuong(soA)}")
    println("tinh thương $soA va $soB = ${tinhThuong(soA.toFloat(), soB.toFloat())}")
    println("in hoa $soA = ${binhPhuong(soA)}")
    val tenSV = "văn hoàng"
    println("In hoa $tenSV = ${inHoa(tenSV)}")
    val length = tenSV.let {
        val l = it.length
        l
    }
    val a2 = soA.run {
        val kg = this * 2
        kg
    }
    println("Số A ${soA} x 2 là ${a2}")
    println("Độ dài chuỗi $tenSV = $length")


}
val inHoa :(String) -> String = String::uppercase
val tinhTong : (Int,Int) -> Int = {soA: Int, soB: Int -> (soA + soB)}
val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if (soB == 0f){
        "số bị chia phải khác 0!"
    }else{
        val c = soA / soB
        c
    }
    soA / soB
}
}
