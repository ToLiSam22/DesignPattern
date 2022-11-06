package chapter11_mvc

import kotlin.properties.Delegates

abstract class Model(
    private val view: View,
    val name: String,
) {
    var offset = ""

    var bpm: Int by Delegates.observable(INIT_BPM) { _, oldValue, newValue ->
        offset = " ".repeat(16 - name.length - bpm.toString().length)
        view.updateBpm(name, newValue, offset)
    }

    var isActive: Boolean by Delegates.observable(true) { _, oldValue, newValue ->
        view.off()
    }

    abstract fun setBpm(bpm: String?)

    companion object {
        const val INIT_BPM = 0
    }
}

class BPMModel(
    private val view: View,
): Model(view = view, name = "BPM") {

    override fun setBpm(bpm: String?) {
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
}

class HeartRateModel(
    private val view: View,
): Model(view = view, name = "HeartRate") {

    override fun setBpm(bpm: String?) {
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
}
