package chapter6_adapter

// TurkeyAdapter는 Turkey를 상속받아, Duck을 구현하고 있다
class TurkeyAdapter: Turkey(), Duck {
    override fun quak() {
        gobble()
    }
}

// WildTurkeyAdapter는 WildTurkey를 상속받아, Duck을 구현하고 있다
class WildTurkeyAdapter: WildTurkey(), Duck {
    override fun quak() {
        gobble()
    }
}
