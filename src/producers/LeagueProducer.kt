package producers

import model.ladder.Ladder
import model.league.LadderLeague
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

    fun produce(name: String?, ladder: Int? = 1) : LadderLeague{
        val json = URL(Network.leaguesUrl +"$name?ladder=$ladder").readText()
        val result = Network.gson.fromJson(json, LadderLeague::class.java)
        return result
    }

    fun produceWithLadder(name: String?) : LadderLeague{
        val json = URL(Network.leaguesUrl +"$name?ladder=1").readText()
        val result = Network.gson.fromJson(json, LadderLeague::class.java)
        return result
    }
}