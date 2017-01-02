package model.league

import model.ladder.Ladder
import org.junit.Rule

/**
 * Created by sentosh1ne on 02.01.2017.
 */
data class LadderLeague(val description: String?, val endAt: String?, val event: Boolean?, val id: String?, val registerAt: String?,
                        val rules: List<Rule>?, val startAt: String?, val url: String?, val ladder: Ladder)
