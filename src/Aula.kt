class Aula{

}

fun main() {

    val aluno = Person()
    val aluno2 = Person()
    val copiaAluno = aluno

    aluno.name = "Wagner"
    aluno.phone = "119999-9999"
    aluno.email = "aluno@gmail.com"
    aluno.printGreetings("Olá ")

    aluno2.name = "Limas"
    aluno2.phone = "118988-9999"
    aluno2.email = "aluno2@gmail.com"
    aluno2.printGreetings("Olá ")

    copiaAluno.printGreetings("Olá")
    copiaAluno.phone = "119797-9999"
    copiaAluno.email = "richard@gmail.com"
    copiaAluno.name = "Richard"

    aluno.printGreetings("Olá")  // Mostrará "Olá Richard", pois `aluno` e `copiaAluno` apontam para o mesmo objeto

    val SPFC = Team()
    SPFC.name = "São Paulo"
    SPFC.players.add(aluno)
    SPFC.players.add(aluno2)
    SPFC.players.add(copiaAluno)

    println("\nEmails e telefones dos jogadores:")
    SPFC.printAllPlayersEmailAndPhone()
}


class Team {
    var players: MutableList<Person> = mutableListOf()
    var name: String = ""

    fun getAllPlayersWithNameBiggerThan(size: Int): List<Person> {
        return this.players.filter { person -> person.name.length > size }
    }

    fun printAllPlayersEmailAndPhone() {
        this.players.forEach { player ->
            println(player.getEmailAndPhone())
        }
    }
}

class Person {
    var name: String = ""
    var age: Int = 0
    var email: String = ""
    var phone: String = ""

    fun getEmailAndPhone(): String {
        return "email: ${this.email} phone: ${this.phone}"
    }

    fun printGreetings(hello: String) {
        println("$hello ${this.name}")
    }

    fun isOlderThan(targetAge: Int): Boolean {
        return this.age > targetAge
    }
}