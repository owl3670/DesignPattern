package flyweight

class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val deciduousLocations = arrayOf(intArrayOf(1, 1), intArrayOf(33, 50), intArrayOf(100, 90))
            val coniferLocations = arrayOf(intArrayOf(10, 87), intArrayOf(24, 76), intArrayOf(2, 64))
            val treeFactory = TreeFactory()
            val d : Tree
            val c : Tree
            try {
                d = treeFactory.getTree("deciduous")
                c = treeFactory.getTree("conifer")
                for (i in deciduousLocations.indices) {
                    d.display(deciduousLocations[i][0], deciduousLocations[i][1])
                }
                for (i in coniferLocations.indices) {
                    c.display(coniferLocations[i][0], coniferLocations[i][1])
                }
            }catch (e: Exception){
                println(e.stackTrace)
            }
        }
    }
}