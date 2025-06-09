package larva

public interface LarvalFormatter {

    public fun accept(value: Any): Boolean

    public fun format(value: Any): String
}

public object ToStringLarvalFormatter : LarvalFormatter {
    override fun accept(value: Any): Boolean = true

    override fun format(value: Any): String = value.toString()
}
