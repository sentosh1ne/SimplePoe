package utility.tests

import model.ladder.Ladder
import producers.LadderProducer

/**
 * Created by sentosh1ne on 30.12.2016.
 */
fun main(args: Array<String>) {
    val producer : LadderProducer = LadderProducer()
    val ladder: Ladder = producer.getLadderByName("Standard")
    val ladderOffset = producer.getLadderByOffset("Standard",1)
    println(ladder.total)
    println(ladderOffset.total)

}
