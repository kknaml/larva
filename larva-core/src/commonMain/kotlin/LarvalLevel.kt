package larva

import kotlin.jvm.JvmInline

@JvmInline
public value class LarvalLevel(
    private val value: Int
) {

    public fun string(): String = when (this) {
        VERBOSE -> "VERBOSE"
        DEBUG -> "DEBUG"
        INFO -> "INFO"
        WARN -> "WARN"
        ERROR -> "ERROR"
        ASSERT -> "ASSERT"
        else -> "UNKNOWN"
    }

    public operator fun compareTo(other: LarvalLevel): Int {
        return value.compareTo(other.value)
    }

    public companion object {
        public val VERBOSE: LarvalLevel = LarvalLevel(0)
        public val DEBUG: LarvalLevel = LarvalLevel(1)
        public val INFO: LarvalLevel = LarvalLevel(2)
        public val WARN: LarvalLevel = LarvalLevel(3)
        public val ERROR: LarvalLevel = LarvalLevel(4)
        public val ASSERT: LarvalLevel = LarvalLevel(5)
    }
}