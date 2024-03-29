package fr.epita.android.kingofelysee.objects



data class Card(val id: Int, val effect: Effect, val hasToChooseTarget: Boolean, val feedbackMessage: String = "", val price: Int = 0) {

    // Only for optimization, might be totally overkill
    override fun equals(other: Any?): Boolean {
        if (other == null) return false

        val otherAsCard = other as Card

        return otherAsCard.id == this.id
    }

    override fun hashCode(): Int {
        return this.id.hashCode()
    }
}

enum class Effect {
    IMMEDIATE,
    DELAYED
}