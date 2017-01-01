package utility.tests

import model.league.League
import org.junit.Assert
import org.junit.Test
import producers.LeagueProducer

/**
 * Created by sentosh1ne on 01.01.2017.
 */
class TestLeagueProducer {

    @Test
    fun produceNamed(){
        val league : League = LeagueProducer().produce("Breach")
        Assert.assertNotNull(league)
        Assert.assertTrue(league.description?.isNotEmpty() as Boolean)
    }
}