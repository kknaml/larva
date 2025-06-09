package larva

import larva.internal.ILarva

public class LarvalConfig(
    public val out: (LarvalLevel, String) -> Unit = ::defaultOut,
    public var level: LarvalLevel = LarvalLevel.INFO,
    public val formatters: MutableList<LarvalFormatter> = mutableListOf(),
    public val fallbackFormatter: LarvalFormatter = ToStringLarvalFormatter
)

private fun defaultOut(level: LarvalLevel, content: String) {
    ILarva.defaultOut(level, content)
}
