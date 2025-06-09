package larva.internal

import larva.LarvalLevel

internal open class NativeLarval : ILarva {

    override fun defaultOut(level: LarvalLevel, finalContent: String) {
        TODO("Not yet implemented")
    }
}

internal actual fun larvaPlatform(): ILarva {
    TODO("Not yet implemented")

}