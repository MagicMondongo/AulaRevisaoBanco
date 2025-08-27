package Classes

import ENUM.Material
import java.math.BigDecimal

class CaixaDAgua(
    val material: Material,
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal?,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
    //val dimensao : Array<Double>, //Altura, profundidade, largura // Operador diamante

){

}

