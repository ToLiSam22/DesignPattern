package chapter9_iterator

class DinerMenuIterator(
    val menuItems: Array<MenuItem?>,
): Iterator {
    private var pos = 0

    override fun hasNext(): Boolean {
        return !(pos >= menuItems.size || menuItems[pos] == null)
    }

    override fun next(): MenuItem {
        return menuItems[pos++] ?: throw NullPointerException("더이상 출력할 메뉴가 없습니다")
    }
}
