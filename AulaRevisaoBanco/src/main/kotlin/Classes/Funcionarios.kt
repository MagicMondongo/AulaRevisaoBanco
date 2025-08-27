package Classes

import OpenClass.Conta
import ENUM.Setor
import ENUM.Sexo
import OpenClass.Pessoa
import java.math.BigDecimal

class Funcionarios(
     cpf: Int,
     nome: String,
     idade: Int,
    val altura: Double,
    val peso: Double,
    val salario: BigDecimal,
    val setor: Setor,
    val sexo: Sexo,
    ): Pessoa(
       nome = nome,
        cpf = cpf,
        idade = idade,

    ) {
        //Comportamentos do Profssional
        fun instalarCaixaDAgua(clt: Funcionarios){
            if(clt.setor.equals(Setor.MONTAGEM)){
                println("Profissional habilitado")
            } else{
                println("Profissional desqualificado")
            }
        }

    override fun receberConta(conta: Conta, aPagar : BigDecimal){
        conta.saldo = conta.saldo.subtract(aPagar)

}}