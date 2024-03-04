data class Person(
    val nama: String,
    val hobi: String,
    val agama: String,
    val Citacita: String
)

fun main() {
    val person = Person(
        nama = "Daffa Yosataris",
        hobi = "Membaca",
        agama = "Islam",
        Citacita = "Menjadi Presiden Republik Indonesia"
    )

    println("Nama: ${person.nama}")
    println("Hobi: ${person.hobi}")
    println("agama: ${person.agama}")
    println("Citacita: ${person.Citacita}")
}