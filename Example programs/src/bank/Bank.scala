package bank

class Bank {
  private var _customers: List[Customer] = Nil
  private var _accounts: List[Account] = Nil
  private var nextCustomerNumber = 0
  private var nextAccountNumber = 0

  def addCustomer(fname: String, lname: String, address: Address): Unit = {
    nextCustomerNumber += 7
    _customers ::= new Customer(fname, lname, nextCustomerNumber.toString, address)
  }

  def openAccount(c: Customer): Account = {
    nextAccountNumber += 13
    val account = new Account(c, nextCustomerNumber.toString)
    _accounts ::= account
    account
  }

  def closeAccount(a: Account): Boolean = {
    if(_accounts.contains(a)) {
      _accounts = _accounts.filter(_ != a)
      if(!a.customer.removeAccount(a.id)) {
        println("Account is not part of customer.")
      }
      true
    } else false

  }

  def findCustomer(fname: String, lname: String): Option[Customer] = {
    _customers.find(c => c.firstName == fname && c.lastName == lname)
  }

  def findCustomer(id: String): Option[Customer] = {
    _customers.find(_.id == id)
  }

  def findAccount(id: String): Option[Account] = {
    _accounts.find(_.id == id)
  }
}
