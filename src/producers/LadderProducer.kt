package producers

import model.ladder.Ladder
import utility.Network
import java.net.URL

/**
 * Created by sentosh1ne on 30.12.2016.
 */
class LadderProducer {

    fun produce(ladder : String?): Ladder {
        val json = URL(Network.baseUrl + ladder).readText()
        val result = Network.gson.fromJson(json, Ladder::class.java)
        return result
    }

    fun produce(ladder: String?,offset:Int?): Ladder {
        val json = URL(Network.baseUrl + ladder + "?offset=$offset").readText()
        val result = Network.gson.fromJson(json, Ladder::class.java)
        return result
    }

    fun produce(ladder: String?,offset: Int?,limit: Int?) : Ladder{
        val json = URL(Network.baseUrl + ladder + "?offset=$offset&limit=$limit" ).readText()
        val result = Network.gson.fromJson(json, Ladder::class.java)
        return result
    }



}