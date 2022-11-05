package chapter10_protection_proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

inline fun <reified T : Person> T.proxy(): Person {
    return Proxy.newProxyInstance(
        Person::class.java.classLoader,
        arrayOf(Person::class.java),
        OwnerInvocationHandler(this)
    ) as Person
}

class OwnerInvocationHandler<T: Person>(private val caller: T) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        return try {
            when {
                method!!.name.startsWith("getInterests") -> {
                    method.invoke(caller)
                }
                method!!.name.equals("setGeekRating") -> {
                    throw IllegalAccessException("잘못된 접근입니다")
                }
                method!!.name.startsWith("setInterests") -> {
                    method.invoke(caller, args!![0])
                }
                else -> {
                    throw IllegalAccessException("지원하지 않는 함수입니다")
                }
            }
        } catch (e: Exception) {
            println(e)
        }
    }
}
