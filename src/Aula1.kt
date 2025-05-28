fun main() {

    val aluno = Person(name = "Wagner", phone = "119999-9999", email = "aluno@gmail.com")
    val aluno2 = Person(name = "Limas", phone = "118988-9999", email = "aluno2@gmail.com")
    val copiaAluno = aluno

    aluno.printGreetings("Olá ")

    aluno2.printGreetings("Olá ")


    copiaAluno.name = "Richard"
    copiaAluno.phone = "119797-9999"
    copiaAluno.email = "richard@gmail.com"

    aluno.printGreetings("Olá")

    val SPFC = Team(name = "São Paulo")
    SPFC.players.add(aluno)
    SPFC.players.add(aluno2)
    SPFC.players.add(copiaAluno)

    println("\nEmails e telefones dos jogadores:")
    SPFC.printAllPlayersEmailAndPhone()
}

data class Person(
    var name: String,
    var age: Int = 0,
    var email: String = "",
    var phone: String = ""
) {
    fun getEmailAndPhone(): String {
        return "email: $email phone: $phone"
    }

    fun printGreetings(hello: String) {
        println("$hello $name")
    }

    fun isOlderThan(targetAge: Int): Boolean {
        return age > targetAge
    }
}

class Team(var name: String) {
    val players: MutableList<Person> = mutableListOf()

    fun getAllPlayersWithNameBiggerThan(size: Int): List<Person> {
        return players.filter { it.name.length > size }
    }

    fun printAllPlayersEmailAndPhone() {
        players.forEach { player ->
            println(player.getEmailAndPhone())
        }
    }
}
