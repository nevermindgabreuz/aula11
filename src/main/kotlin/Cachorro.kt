class Cachorro(
    peso:Float,
    altura:Short,
):Mamifero(
    peso = peso,
    altura = altura,
) {
    override fun comer(): String = "Comendo ração para cachorros"
    override fun emitirSom():String = "Latinho como um cachorro"

}