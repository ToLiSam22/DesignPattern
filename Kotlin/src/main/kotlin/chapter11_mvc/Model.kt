package chapter11_mvc

import kotlin.properties.Delegates

class Model(
    private val view: View,
) {
    var bpm: Int by Delegates.observable(INIT_BPM) { _, oldValue, newValue ->
        view.updateBpm(newValue)
    }

    private var isActive: Boolean by Delegates.observable(true) { _, oldValue, newValue ->
        view.off()
    }

    fun setBpm(bpm: String?) {
        if (bpm == "EXIT") {
            isActive = false
        } else {
            try {
                this.bpm = bpm?.toInt() ?: 0
            } catch (e: Exception) {
                this.bpm = 0
            }
        }
    }

    companion object {
        val INIT_BPM = 0
    }
}
