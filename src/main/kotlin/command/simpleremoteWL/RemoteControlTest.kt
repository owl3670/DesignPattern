package command.simpleremoteWL

class RemoteControlTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val remote = SimpleRemoteControl()
            val light = Light()
            val garageDoor = GarageDoor()

            remote.setCommand(light::on)
            remote.buttonWasPressed()
            remote.setCommand(garageDoor::up)
            remote.buttonWasPressed()
            remote.setCommand(garageDoor::lightOn)
            remote.buttonWasPressed()
            remote.setCommand(garageDoor::lightOff)
            remote.buttonWasPressed()
        }
    }
}