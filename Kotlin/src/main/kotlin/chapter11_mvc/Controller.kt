package chapter11_mvc


class Controller{
    private lateinit var model: Model

    fun setBpm(bpm: String?) {
        model.setBpm(bpm)
    }

    fun setModel(model: Model) {
        this.model = model
    }

    fun on() {
        this.model.setBpm(Model.INIT_BPM.toString())
    }
}
