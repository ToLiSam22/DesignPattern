package chapter10_protection_proxy

object MatchMakingTestApplication  {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[MatchMakingTestApplication] 시작")
        val joe = PersonInfo(name = "Joe", gender = "FEMALE", interests = "")
        val ownerProxy = PersonImpl(person = joe).proxy()
        ownerProxy.setInterests("볼링, 바둑")
        println("본인 프록시에 관심사항을 등록합니다 [${ownerProxy.getInterests()}]")
        try {
            ownerProxy.setGeekRating(10);
        } catch (e: Exception) {
            println("본인 프록시에는 괴짜 지수를 매길 수 없습니다")
        }
    }
}
