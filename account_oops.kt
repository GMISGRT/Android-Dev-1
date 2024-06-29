fun main() {
    val acc = Account("123abcd",400000.0)
    println("Account num : ${acc.accNum} , Balance : ${acc.getBalance()}")
    acc.deposit(4000.0)
    acc.withdraw(600.0)
    println("Final balance:${acc.getBalance()}")
}
class Account(var accNum : String, var bal : Double)
{
    fun deposit(amount : Double)
    {
        if (amount > 0)
        {
            bal += amount
            println("Deposit:$amount. New balance:$bal")
        }
        else
        {
            println("Enter positive deposit amount.")
        }
    }
    fun withdraw(amount : Double)
    {
        if (amount > 0)
        {
            if (bal >= amount)
            {
                bal -= amount
                println("Withdraw:$amount. New balance:$bal")
            }
            else
            {
                println("Invalid transaction.")
            }
        }
        else
        {
            println("Enter positive withdrawal amount.")
        }
    }
    fun getBalance() : Double = bal
}