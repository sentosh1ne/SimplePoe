package model.league

import org.junit.Rule

data class League(var description: String?,  var endAt: String?,var event: Boolean?,
                  var id: String?,var registerAt: String?,
                  var rules: List<Rule>?,var startAt: String?,var url: String? ) {

}
