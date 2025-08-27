package Classes

import OpenClass.Pessoa

class Cliente(
     nome: String,
     idade: Int,
     cpf: Int,
     sexo: String,
    val telefone:  Int,
    val email: String,
    val endereco: String,
    val pedidos: Array<String>,
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
){
}