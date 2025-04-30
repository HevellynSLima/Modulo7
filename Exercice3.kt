fun main() {
    
   
    println(UtilityHelper.isWeekend())
    
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println(UtilityHelper.isWeekend())
    
    UtilityHelper.setCurrentDay(DayOfWeek.FRIDAY)
    println(UtilityHelper.isWeekend())
   
    
}

enum class DayOfWeek(var minuscula: String){
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");
    
    
    }


object UtilityHelper{
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY
    
    fun setCurrentDay (day: DayOfWeek){
        currentDay = day
    }
    
    fun isWeekend(): Boolean {
        return currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY
    }
}
