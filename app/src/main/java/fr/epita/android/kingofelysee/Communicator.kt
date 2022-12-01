package fr.epita.android.kingofelysee
import android.text.Spanned
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import fr.epita.android.kingofelysee.objects.Character

interface Communicator {
    fun passCharacterToFragment(id: Int, i: Int)

    fun loadShopFragment()

    fun unloadFragment()

    fun loadMyCardsFragment()

    fun loadDiceFragment()

    fun toggleShopBtn()

    fun loadMap()

    fun dialog(message: String, title: String, resumeGame: Boolean = false)

}