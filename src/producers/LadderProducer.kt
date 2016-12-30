package producers

import model.ladder.Ladder
import utility.Network
import java.net.URL

/**
 * Created by sentosh1ne on 30.12.2016.
 */
class LadderProducer {

    public fun getLadderByName(ladder : String?): Ladder {
        val json = URL(Network.baseUrl + ladder).readText();
        val result = Network.gson.fromJson(json, Ladder::class.java);
        return result
    }

    public fun getLadderByOffset(ladder: String?,offset:Int?): Ladder {
        val json = URL(Network.baseUrl + ladder + "?offset=$offset").readText();
        val result = Network.gson.fromJson(json, Ladder::class.java);
        return result
    }
}