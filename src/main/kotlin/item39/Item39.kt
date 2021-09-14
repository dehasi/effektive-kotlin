package item39

sealed class ValueMatcher<TYPE> {
    abstract fun match(thatValue: TYPE): Boolean

    class Equal<TYPE>(val value: TYPE) : ValueMatcher<TYPE>() {
        override fun match(thatValue: TYPE): Boolean = this.value == thatValue
    }

    class NotEqual<TYPE>(val value: TYPE) : ValueMatcher<TYPE>() {
        override fun match(thatValue: TYPE): Boolean = this.value != thatValue
    }

    fun reversed(): ValueMatcher<TYPE> =
        when (this) {
            is Equal -> NotEqual(this.value)
            is NotEqual -> Equal(this.value)
        }
}