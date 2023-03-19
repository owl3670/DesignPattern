package command.remote

class RemoteControl {
    private val onCommands: Array<Command> = Array(7) { NoCommand() }
    private val offCommands: Array<Command> = Array(7) { NoCommand() }

    init {
        val noCommand = NoCommand()
        for (i in 0 until 7) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("------ Remote Control ------")
        for (i in 0 until onCommands.size) {
            sb.append("[slot $i] ${onCommands[i].javaClass.simpleName} ${offCommands[i].javaClass.simpleName}\n")
        }
        return sb.toString()
    }
}