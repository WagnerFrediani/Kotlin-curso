import kotlin.random.Random

fun main() {

    var account = Account("Wagner")
    account.print()
    account.deposit(100.0)
    account.print()
    account.withdraw(50.0)
    account.print()
    account.withdraw(80.0)
    account.print()

}

class Account(name: String){
    private var balance: Double
    var name: String
    var address: String
    private var id : Int

    init {
        this.name = name
        this.balance = 0.0
        this.address = ""
        this.id = Random.nextInt(0,16000)
    }

    fun deposit(amount: Double){
        balance = balance + amount

    }

    fun withdraw(amount: Double): Double{
        balance = balance  - amount

        if(balance < 0.0)
            balance = 0.0
        return balance
    }

    fun getBalance() = this.balance


    fun print(){
        println("saldo: $balance, name: $name, id: $id")
    }

}