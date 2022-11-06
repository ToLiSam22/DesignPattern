package chapter11_mvc

import kotlin.system.exitProcess

class View(
    private val controller: Controller,
) {
    fun updateBpm(name: String, bpm: Int, offset: String) {
        println("+----------------------------+")
        println("| CURRENT $name: $bpm $offset|")
        println("+----------------------------+")
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