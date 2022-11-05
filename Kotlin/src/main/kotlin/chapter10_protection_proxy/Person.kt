package chapter10_protection_proxy

data class PersonInfo (
    val name: String,
    val gender: String,
    val interests: String,
    val rating: Int = 0,
    val ratingCount: Int = 0,
)

interface Person {
    fun setInterests(interests: String)
    fun getInterests(): String
    fun getGeekRating(): Int
    fun setGeekRating(rating: Int)
}

class PersonImpl(private var person: PersonInfo): Person {
    override fun setInterests(interests: String) {
        person = person.copy(
            interests = interests
        )
    }

    override fun getInterests(): String {
        return person.interests
    }

    override fun getGeekRating(): Int {
        return if (person.ratingCount == 0) 0 else person.rating/person.ratingCount
    }

    override fun setGeekRating(rating: Int) {
        person = person.copy(
            rating = person.rating + rating,
            ratingCount = person.ratingCount + 1,
        )
    }
}
