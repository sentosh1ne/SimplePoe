package utility.tests

import org.junit.Assert
import org.junit.Test
import producers.LadderProducer

/**
 * Created by sentosh1ne on 30.12.2016.
 */
class TestLadderProducer {

    @Test
    fun testLadderByName(){
        val ladder: LadderProducer = LadderProducer()
        Assert.assertNotNull(ladder.getLadderByName("Hardcore").entries);
    }
}