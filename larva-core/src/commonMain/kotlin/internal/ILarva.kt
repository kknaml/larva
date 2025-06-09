package larva.internal

import larva.LarvalLevel

internal interface ILarva {


    fun defaultOut(level: LarvalLevel, finalContent: String)

    companion object : ILarva by larvaPlatform()
}

internal expect fun larvaPlatform(): ILarva
