package command.remoteWL

class RemoteLoader {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val remoteControl = RemoteControl()

            val livingRoomLight = Light("Living Room")
            val kitchenLight = Light("Kitchen")
            val ceilingFan = CeilingFan("Living Room")
            val garageDoor = GarageDoor("Main house")
            val stereo = Stereo("Living Room")

            remoteControl.setCommand(0, object : Command {
                override fun execute() {
                    livingRoomLight.on()
                }
            }
            , object : Command {
                override fun execute() {
                    livingRoomLight.off()
                }
            })
            remoteControl.setCommand(1, object : Command {
                override fun execute() {
                    kitchenLight.on()
                }
            }, object : Command {
                override fun execute() {
                    kitchenLight.off()
                }
            })
            remoteControl.setCommand(2, object : Command {
                override fun execute() {
                    ceilingFan.high()
                }
            }, object : Command {
                override fun execute() {
                    ceilingFan.off()
                }
            })

            val stereoOnWithCD = object : Command {
                override fun execute() {
                    stereo.on()
                    stereo.setCD()
                    stereo.setVolume(11)
                }
            }
            remoteControl.setCommand(3, stereoOnWithCD, object : Command {
                override fun execute() {
                    stereo.off()
                }
            })
            remoteControl.setCommand(4, object : Command {
                override fun execute() {
                    garageDoor.up()
                }
            }, object : Command {
                override fun execute() {
                    garageDoor.down()
                }
            })

            println(remoteControl)

            remoteControl.onButtonWasPushed(0)
            remoteControl.offButtonWasPushed(0)
            remoteControl.onButtonWasPushed(1)
            remoteControl.offButtonWasPushed(1)
            remoteControl.onButtonWasPushed(2)
            remoteControl.offButtonWasPushed(2)
            remoteControl.onButtonWasPushed(3)
            remoteControl.offButtonWasPushed(3)
            remoteControl.onButtonWasPushed(4)
            remoteControl.offButtonWasPushed(4)
            remoteControl.onButtonWasPushed(5)
            remoteControl.offButtonWasPushed(5)
        }
    }
}