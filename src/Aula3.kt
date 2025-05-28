class Aula3 {
}
fun main() {
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SUMMER)
    SchedulerHandler.currentSeason()
}


object SchedulerHandler {
    private var season: Season = Season.WINTER

    fun setSeason(newSeason: Season) {
        this.season = newSeason
    }

    fun currentSeason() = println(season)
}

enum class Season(val translate: String) {
    WINTER("inverno"),
    SPRING("primavera"),
    SUMMER("verão"),
    FALL("outono")
}