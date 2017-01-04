package model.stash_tabs

import com.google.gson.annotations.SerializedName


data class Stash(var accountName : String?,var id: String?, var items: List<Item>?,
                 var lastCharacterName: String?,var nextChangeId: String?,var public: Boolean?,
                 var stash: String, var stashType: String?, var stashes: List<Stash>?) {

 }
