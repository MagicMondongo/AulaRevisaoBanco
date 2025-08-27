package OpenClass

import ENUM.TipoConta
import java.math.BigDecimal

open class Conta (
    var saldo: BigDecimal,
    var id: Long,
    var tipoConta: TipoConta,
)
{
}