package chapter7_adapter

// TurkeyAdapter는 Turkey를 상속받는다
open class Turkey {
    open fun gobble() {
        println("칠면조가 골골")
    }

    open fun fly() {
        println("칠면조가 짧은 거리를 날고있어요!")
    }
}

// WildTurkeyAdapter는 WildTurkey를 상속받는다
open class WildTurkey: Turkey() {
    override fun gobble() {
        println("야생칠면조가 골골")
    }

    override fun fly() {
        println("야생칠면조가 짧은 거리를 날고있어요!")
    }
}