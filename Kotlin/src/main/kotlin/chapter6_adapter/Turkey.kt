package chapter6_adapter

// TurkeyAdapter는 Turkey를 상속받는다
open class Turkey {
    fun gobble() {
        println("칠면조가 골골")
    }

    fun fly() {
        println("칠면조가 짧은 거리를 날고있어요!")
    }
}

// WildTurkeyAdapter는 WildTurkey를 상속받는다
open class WildTurkey {
    fun gobble() {
        println("야생칠면조가 골골")
    }

    fun fly() {
        println("야생칠면조가 짧은 거리를 날고있어요!")
    }
}