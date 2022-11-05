package chapter10_virtual_proxy

import java.net.URL

object ImageProxyTestApplication  {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[ImageProxyTestApplication] 시작")
        val initialURL = URL("https://play-lh.googleusercontent.com/6f6MrwfRIEnR-OIKIt_O3VdplItbaMqtqgCNSOxcfVMCKGKsOdBK5XcI6HZpjssnB2Y")
        val icon = ImageProxy(initialURL)
        icon.paintIcon(c = null, g = null, x = 600, y = 800);
    }
}