package utility

import model.Ladder
import producers.LadderProducer

/**
 * Created by sentosh1ne on 30.12.2016.
 */
fun main(args: Array<String>) {
    val producer : LadderProducer = LadderProducer()
    val ladder: Ladder = producer.getLadder("Standard")
    print(ladder.total)
}