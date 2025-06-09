package larva

public interface LarvaLogger {

    public val config: LarvalConfig

    public fun log(
        level: LarvalLevel,
        throwable: Throwable? = null,
        rawLazyMessage: () -> Any?
    )

    public fun buildAndLog(
        fn: LogRecordBuilder.() -> Unit
    )

    public companion object : LarvaLogger by default()
}

private fun default(): LarvaLogger {
    TODO()
}

public inline fun LarvaLogger.v(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.VERBOSE, throwable, lazyMessage)
}

public inline fun LarvaLogger.d(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.DEBUG, throwable, lazyMessage)
}

public inline fun LarvaLogger.i(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.INFO, throwable, lazyMessage)
}

public inline fun LarvaLogger.w(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.WARN, throwable, lazyMessage)
}

public inline fun LarvaLogger.e(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.ERROR, throwable, lazyMessage)
}

public inline fun LarvaLogger.a(
    throwable: Throwable? = null,
    noinline lazyMessage: () -> Any?
) {
    log(LarvalLevel.ASSERT, throwable, lazyMessage)
}
