package bank

class Customer (val firstName: String,
                val lastName: String,
                val id: String,
                private var _accounts: List[Account],
                private  var _address: Address) {

}
