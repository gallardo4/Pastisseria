fun main(){
    menuPasta()
    menuBeguda()
}

fun menuPasta(){
    println("\nPasta")

    val croissant: Pasta = Pasta("Croissant", 1.5f, 150f, 576f)
    println("\n$croissant")

    val ensaimada: Pasta = Pasta("Ensaimada", 1.8f, 160f, 654f)
    println("\n$ensaimada")

    val donut: Pasta = Pasta("Donut", 1.35f, 146f, 558f)
    println("\n$donut")
}

fun menuBeguda(){
    println("\nBeguda\n")

    val aigua: Beguda = Beguda("Aigua", 1f, false)
    println(aigua)

    val cafe: Beguda = Beguda("Café", 1.35f, false)
    println(cafe)

    val teVermell: Beguda = Beguda("Té vermell", 1.5f, false)
    println(teVermell)

    val cola: Beguda = Beguda("Cola", 1.65f, true)
    println(cola)
}