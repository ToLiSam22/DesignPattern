package chapter6_command.iot

class CeilingFan(
    private val location: String = "",
    private var speed: CeilingFanSpeed = CeilingFanSpeed.OFF
) {

    fun speedUp() {
        speed = this.speed.up()
        println("[$location] 선풍기 속도를 한단계 올립니다: 현재 속도 - [$speed]")
    }

    fun speedDown() {
        speed = this.speed.down()
        println("[$location] 선풍기 속도를 한단계 낮춥니다: 현재 속도 - [$speed]")
    }

    enum class CeilingFanSpeed(val strength: Int) {
        OFF(0),
        LOW(1),
        MEDIUM(2),
        HIGH(3);

        fun up() = find(this.strength + 1)
        fun down() = find(this.strength - 1)

        companion object {
            fun find(strength: Int) = when (strength) {
                    -1 -> OFF
                    0 -> OFF
                    1 -> LOW
                    2 -> MEDIUM
                    3 -> HIGH
                    4 -> HIGH
                    else -> OFF
            }
        }
    }
}