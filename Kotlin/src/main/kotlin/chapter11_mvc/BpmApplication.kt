package chapter11_mvc

object BpmApplication {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val controller = Controller()
        // view에서 입력된 값을 controller에 전달하기 위해서!
        val view = View(controller = controller)
        // model의 값이 바뀌면
        val model = Model(view = view)
        controller.setModel(model = model)
        view.updateBpm(Model.INIT_BPM)
    }
}
