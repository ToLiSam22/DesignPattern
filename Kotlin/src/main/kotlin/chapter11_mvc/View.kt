package chapter11_mvc

import kotlin.system.exitProcess

class View(
    private val controller: Controller,
) {
    fun updateBpm(bpm: Int) {
        println("+---------------------+")
        println("| CURRENT BPM: $bpm     |")
        println("+---------------------+")
        getBpmFromUser()
    }

    fun off() {
        exitProcess(0);
    }

    private fun getBpmFromUser() {
        print("new BPM: ")
        controller.setBpm(readLine())
    }
}