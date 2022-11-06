package chapter11_mvc

object BpmApplication {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val controller = Controller()
        // view에서 입력된 값을 controller에 전달하기 위해서!
        val view = View(controller = controller)
        val bpmModel = BPMModel(view = view)
        val heartRateModel = HeartRateModel(view = view)

        //controller.setModel(model = bpmModel)
        //view.updateBpm(name = bpmModel.name, bpm = bpmModel.bpm)

        controller.setModel(model = heartRateModel)
        controller.on()
    }
}
