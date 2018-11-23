import java.util.*

class KingVampire(name : String) : Vampire(name) {
    init {
        hitPoints = 140
        lives = 4
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage /2)
    }

    fun runAway(): Boolean
    {
        return lives < 2
    }

    fun dodges(): Boolean
    {
        val rand = Random()
        val chance = rand.nextInt(6) //from 0 to 5
        if (chance > 3)
        {
            println("Drakula dodges")
            return true
        }
        return false
    }
}
