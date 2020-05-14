package kfoldem

import java.awt.Rectangle
import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class App

fun main() {
    val screenRect = Rectangle(Toolkit.getDefaultToolkit().screenSize)
    val capture: BufferedImage = Robot().createScreenCapture(screenRect)
    ImageIO.write(capture, "png", File("full.png"))
}
