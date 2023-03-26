package command.simpleremote

class RemoteControlTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val remote = SimpleRemoteControl()
            val light = Light()
            val garageDoor = GarageDoor()
            val lightOn = LightOnCommand(light)
            val garageOpen = GarageDoorOpenCommand(garageDoor)

            remote.setCommand(lightOn)
            remote.buttonWasPressed()
            remote.setCommand(garageOpen)
            remote.buttonWasPressed()
        }
    }
}