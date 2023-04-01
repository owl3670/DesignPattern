package command.swing

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel

class SwingCommandExample {
    lateinit var frame: JFrame
    lateinit var panel: JPanel

    fun go() {
        frame = JFrame()
        panel = JPanel()

        val onButton = JButton("On")
        val offButton = JButton("Off")

        val light = JLabel("light")
        light.isOpaque = true
        light.background = java.awt.Color.LIGHT_GRAY

        onButton.addActionListener {
            light.background = java.awt.Color.YELLOW
        }
        offButton.addActionListener {
            light.background = java.awt.Color.LIGHT_GRAY
        }

        frame.contentPane = panel
        panel.add(onButton)
        panel.add(offButton)
        panel.add(light)

        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.isVisible = true
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val swingCommandExample = SwingCommandExample()
            swingCommandExample.go()
        }
    }
}