fun main() {
    
    var dayOfWeek: DayOfWeek = DayOfWeek.SABADO
    println(DayOfWeek.SABADO.minuscula)
    dayOfWeek.OlaDayOfWeek()
    
}

enum class DayOfWeek(var minuscula: String){
    DOMINGO("domingo"),
    SEGUNDA("segunda-feira"),
    TERCA("terça-feira"),
    QUARTA("quarta-feira"),
    QUINTA("quinta-feira"),
    SEXTA("sexta-feira"),
    SABADO("sabado");
    
    fun OlaDayOfWeek(){
        println("Hoje é $minuscula")
    }
}
