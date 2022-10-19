package command

class Light(val location: String) {

  def on(): Unit = println(location + " light is on")

  def off(): Unit = println(location + " light is off")

}
