package chapter10_virtual_proxy

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon

class ImageProxy(
    private val imageUrl: URL
): Icon {
    private var imageIcon: ImageIcon? = null // ImageProxy와 imageIcon은 같은 인터페이스 Icon을 구현하고 있다
    private var retrieving = false

    @Synchronized
    fun setImageIcon(imageIcon: ImageIcon) {
        this.imageIcon = imageIcon
    }

    // 앨범 커버를 가져오는 데 오래 걸리면 로딩 문구를 띄워주기 위한 프록시
    override fun paintIcon(c: Component?, g: Graphics?, x: Int, y: Int) {
        imageIcon?.let {
            this.paintIcon(c, g, x, y)
        } ?: run {
            println("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요")
            g?.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요", x+300, y+190);
            if (!retrieving) {
                retrieving = true
                Thread(Runnable {
                    try {
                        setImageIcon(ImageIcon(imageUrl, "Album Cover"));
                        c?.repaint();
                    } catch (e: Exception) {
                        println(e);
                    }
                }).start()
            }
        }
    }

    override fun getIconWidth(): Int {
        return if (imageIcon != null) imageIcon!!.getIconWidth() else 800
    }

    override fun getIconHeight(): Int {
        return if (imageIcon != null) imageIcon!!.getIconHeight() else 600
    }

}