object q3
{
  def main(args: Array[String]): Unit =
  {
    val account1 = new Account(2850.0)
    val account2 = new Account(3200.0)

    println("Initial balance in account1:"+ account1.getBalance)
    println("Initial balance in account2:"+ account2.getBalance)

    account1.deposit(900.0)
    println("Balance in account1 after deposit: "+account1.getBalance)

    account1.withdraw(300.0)
    println("Balance in account1 after withdrawal: "+account1.getBalance)

    account1.transfer(500.0, account2)
    println("Balance in account1 after transfer: "+account1.getBalance)
    println("Balance in account2 after transfer:"+ account2.getBalance)
  }
}


class Account(CurrentBalance: Double)
{
  private var balance: Double = CurrentBalance

  def getBalance: Double = balance

  def deposit(amount: Double): Unit =
  {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit =
  {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, targetAccount: Account): Unit =
  {
    require(amount > 0, "Transfer amount must be positive")
    require(amount <= balance, "Insufficient balance for transfer")

    withdraw(amount)
    targetAccount.deposit(amount)
  }
}



