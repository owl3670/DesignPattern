package flyweight

class TreeFactory {
    val d = DeciduousTree()
    val c = ConiferTree()

    fun getTree(type: String): Tree{
        return when(type){
            "conifer" -> c
            "deciduous" -> d
            else -> throw java.lang.Exception("Invalid kind of tree")
        }
    }
}