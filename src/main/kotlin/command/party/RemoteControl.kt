package command.party

class RemoteControl {
    private val onCommands: Array<Command> = Array(7) { NoCommand() }
    private val offCommands: Array<Command> = Array(7) { NoCommand() }
    private var undoCommand: Command? = null

    init {
        val noCommand = NoCommand()
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand?.undo()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("------ Remote Control ------")
        for (i in 0 until onCommands.size) {
            sb.append("[slot $i] ${onCommands[i].javaClass.simpleName} ${offCommands[i].javaClass.simpleName}\n")
        }
        sb.append("[undo] ${undoCommand?.javaClass?.simpleName}\n")
        return sb.toString()
    }
}