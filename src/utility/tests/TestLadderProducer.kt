package utility.tests

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import producers.LadderProducer

/**
 * Created by sentosh1ne on 30.12.2016.
 */
class TestLadderProducer {

    @Test
    fun receivingByName(){
        val ladder: LadderProducer = LadderProducer()
        Assert.assertNotNull(ladder.produce("Hardcore").entries);
    }

    @Test
    fun receivingByNameWithOffset(){
        val ladder: LadderProducer = LadderProducer()
        Assert.assertNotNull(ladder.produce("Hardcore",5).entries!![0].account);
    }

    @Test
    fun produceWithLimit(){
        val ladder: LadderProducer = LadderProducer()
        Assert.assertNotNull(ladder.produce("Hardcore",5,100).entries!![0].account);
        Assert.assertTrue(ladder.produce("Hardcore",5,100).entries!!.isNotEmpty())
    }
}