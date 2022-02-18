abstract class Mamifero(
    peso:Float,
    altura:Short,
):Animal(
    peso = peso,
    altura = altura,
) {
    open fun amamentar():String = "amamentando"
}