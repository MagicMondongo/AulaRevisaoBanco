package UI

fun menu(){
    do {
        println("1 - Cadastrar Caixa D'Agua")
        println("2 - Editar Caixa D'Agua")
        println("3 - Listar Caixa D'Agua")
        println("4 - Excluir Caixa D'Agua")
        println("0 - Sair")

        var opcao = readln().toInt()
        when(opcao){
            0-> println("Adeus amigo!")
            1-> println("Cadastrando caixa....")
            2-> println("Editando caixa....")
            3-> println("Listar caixa....")
            4-> println("Excluir caixa....")
            else -> println("Opção inválida")
        }
    } while (opcao != 0)



}