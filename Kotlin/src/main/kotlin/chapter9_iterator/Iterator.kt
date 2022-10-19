package chapter9_iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem
}