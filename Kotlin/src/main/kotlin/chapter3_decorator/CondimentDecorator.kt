package chapter3_decorator

abstract class CondimentDecorator: Beverage() {
    abstract val beverage: Beverage
}

class Mocha(override val beverage: Beverage) : CondimentDecorator() {
    override var size: SIZE = beverage.size
        get() {
            field = beverage.size
            return field
        }
        set(value) {
            beverage.size = value
            field = value
        }

    override val description: String
        get() = beverage.description + "+모카"

    override fun cost(): Double {
        return when(this.size) {
            SIZE.TALL ->  beverage.cost() + 0.2
            SIZE.GRANDE -> beverage.cost() + 0.4
            SIZE.VENTI -> beverage.cost() + 0.6
        }
    }
}

class Soy(override val beverage: Beverage) : CondimentDecorator() {
    override var size: SIZE = beverage.size
        get() {
            field = beverage.size
            return field
        }
        set(value) {
            beverage.size = value
            field = value
        }

    override val description: String
        get() = beverage.description + "+간장"

    override fun cost(): Double {
        return when(this.size) {
            SIZE.TALL ->  beverage.cost() + 0.1
            SIZE.GRANDE -> beverage.cost() + 0.2
            SIZE.VENTI -> beverage.cost() + 0.3
        }
    }
}

class Whip(override val beverage: Beverage) : CondimentDecorator() {
    override var size: SIZE = beverage.size
        get() {
            field = beverage.size
            return field
        }
        set(value) {
            beverage.size = value
            field = value
        }

    override val description: String
        get() = beverage.description + "+휘핑"

    override fun cost(): Double {
        return when(this.size) {
            SIZE.TALL ->  beverage.cost() + 0.3
            SIZE.GRANDE -> beverage.cost() + 0.6
            SIZE.VENTI -> beverage.cost() + 0.9
        }
    }
}