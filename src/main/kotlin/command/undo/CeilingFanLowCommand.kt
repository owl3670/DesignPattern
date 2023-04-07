package command.undo

class CeilingFanLowCommand(
    private val ceilingFan: CeilingFan
) : Command {
    private var prevSpeed: Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.low()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}