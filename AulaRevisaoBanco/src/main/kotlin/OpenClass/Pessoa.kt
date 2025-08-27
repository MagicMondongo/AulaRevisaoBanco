package OpenClass

import java.math.BigDecimal

open class Pessoa(
    val nome: String,
    val cpf: Int,
    val idade: Int,


    ) {

   open fun receberConta(conta: Conta, aReceber : BigDecimal){
        conta.saldo = conta.saldo.add(aReceber)
    }
}