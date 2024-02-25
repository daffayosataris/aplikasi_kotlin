package com.example.aplikasi_kotlin

data class Biodata(
    val nama: String,
    val jenisKelamin: String,
    val hobi: List<String>,
    val citaCita: String,
    val agama: String
)

fun main() {
    val adiWirawan = Biodata(
        nama = "Daffa Yosataris TH",
        jenisKelamin = "Laki-laki",
        hobi = listOf("Membaca", "Belajar"),
        citaCita = "Menjadi Presiden Republik Indonesia",
        agama = "Islam"
    )

    println("Nama: ${adiWirawan.nama}")
    println("Jenis Kelamin: ${adiWirawan.jenisKelamin}")
    println("Hobi: ${adiWirawan.hobi.joinToString(", ")}")
    println("Cita-cita: ${adiWirawan.citaCita}")
    println("Agama: ${adiWirawan.agama}")
}