package command.remoteWL

class RemoteControl {
    private val onCommands = arrayOfNulls<Command>(7)
    private val offCommands = arrayOfNulls<Command>(7)

    init {
        for (i in 0..6) {
            onCommands[i] = object : Command {
                override fun execute() { }
            }
            offCommands[i] = object : Command {
                override fun execute() { }
            }
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("\n------ Remote Control ------\n")
        for (i in 0..6) {
            sb.append("[slot $i] ${onCommands[i]?.javaClass?.simpleName} ${offCommands[i]?.javaClass?.simpleName}\n")
        }
        return sb.toString()
    }
}