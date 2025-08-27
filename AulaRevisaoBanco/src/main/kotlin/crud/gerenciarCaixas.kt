package crud

import Classes.CaixaDAgua
import ENUM.Material

fun cadastrarCaixa(){
    /*
    val material : Material,
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal?,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
     */
    println("Escolha o material do qual a caixa é composta")
    println("1 - PVC")
    println("2 - Metal")
    println("3 - Plástico")
    println("4 - argamassa")
    val opcao = readln().toInt()
    val material : Material
    when(opcao){
        1-> material = Material.PVC
        2-> material = Material.METAL
        3-> material = Material.PLASTICO
        4 -> material = Material.ARGAMASSA
        else -> material = Material.PVC
    }
    println("Capacidade de caixa em Litros:")
    val litros = readln().toInt()

    println("Cor da Caixa:")
    val cor = readln()

    println("Peso da Caixa")
    val peso = readln().toDouble()

    println("Preço da Caixa:")
    val preco = readln().toBigDecimal()

    println("Altura da Caixa")
    val altura = readln().toDouble()

    println("Profundidade da Caixa")
    val profundidade = readln().toDouble()

    println("Largura da Caixa")
    val largura = readln().toDouble()

    //Salvar as variaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        capacidade = litros,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura
        )   
}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}