var rubrica = ArrayList<Utente>()

fun main(args: Array<String>) {
    println("Rubrica")

    println("nome:")
    var nome = readln()

    println("cognome: ")
    var cognome = readln()

    println("numero: ")
    var numero = readln()

    println("email: ")
    var email = readln()

    println("1-Aggiungi")
    println("2-Elimina")
    println("3-Cerca per nome")
    println("4-Cerca per cognome")
    println("5-Cerca per numero")
    println("6-Cerca per email")
    val scelta: Int = readln().toInt()

    when(scelta){
        1-> aggiungi(nome, cognome, numero, email)
        2-> println("elimina")
        3-> println("cerca per nome")
        4-> println("cerca per cognome")
        5-> println("cerca per numero")
        6-> println("cerca per email")
        else ->{
            println("Esci")
        }

    }


}

fun aggiungi(nome: String, cognome: String, numero: String, email: String){
    val utente = Utente(nome,cognome,numero,email)
    rubrica.add(utente)
}
