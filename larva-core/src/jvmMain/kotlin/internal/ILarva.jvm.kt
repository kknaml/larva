package larva.internal

import larva.LarvalLevel

private object JvmLarva : ILarva {

    override fun defaultOut(level: LarvalLevel, finalContent: String) {
        TODO("Not yet implemented")
    }
}

internal actual fun larvaPlatform(): ILarva = JvmLarva
