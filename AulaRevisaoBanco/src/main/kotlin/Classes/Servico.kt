package Classes

import ENUM.Material
import java.math.BigDecimal

class Servico(
    val preco : BigDecimal,
    val funcionario : Array<Funcionarios>,
    val material: Material,
){

}