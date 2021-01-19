
private var _table: Map<String,Int>? = null
public val table: Map<String,Int>

get() {
    if (_table == null)
        _table = HashMap()

    return _table?: throw AssertionError("Set to null by another thread")
}