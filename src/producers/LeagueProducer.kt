package producers

import model.ladder.Ladder
import model.league.League
import utility.Network
import java.net.URL

/**
 * Created by sentosh1ne on 30.12.2016.
 */
class LeagueProducer {

    fun produce(name : String?) : League{
        val json = URL(Network.leaguesUrl + name).readText()
        val result = Network.gson.fromJson(json, League::class.java)
        return result
    }
}