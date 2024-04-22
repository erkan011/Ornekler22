import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    // Şu anki tarihi al
    val simdikiTarih = LocalDate.now()
    println("Şu anki tarih: $simdikiTarih")

    // Belirli bir tarihi oluştur
    val dogumTarihi = LocalDate.of(1990, 4, 15)
    println("Doğum tarihi: $dogumTarihi")

    // Tarih biçimlendirme
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val formatliTarih = simdikiTarih.format(formatter)
    println("Biçimlendirilmiş tarih: $formatliTarih")

    // Tarih arasındaki farkı hesapla
    val bugun = LocalDate.now()
    val fark = dogumTarihi.until(bugun).years
    println("Yaş: $fark")
}