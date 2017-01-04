package model.stash_tabs

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("net.hexar.json2pojo")
class Item {

    @SerializedName("additionalProperties")
    var additionalProperties: List<AdditionalProperty>? = null
    @SerializedName("corrupted")
    var corrupted: Boolean? = null
    @SerializedName("descrText")
    var descrText: String? = null
    @SerializedName("explicitMods")
    var explicitMods: List<String>? = null
    @SerializedName("flavourText")
    var flavourText: List<String>? = null
    @SerializedName("frameType")
    var frameType: Long? = null
    @SerializedName("h")
    var h: Long? = null
    @SerializedName("icon")
    var icon: String? = null
    @SerializedName("id")
    var id: String? = null
    @SerializedName("identified")
    var identified: Boolean? = null
    @SerializedName("ilvl")
    var ilvl: Long? = null
    @SerializedName("implicitMods")
    var implicitMods: List<String>? = null
    @SerializedName("inventoryId")
    var inventoryId: String? = null
    @SerializedName("league")
    var league: String? = null
    @SerializedName("lockedToCharacter")
    var lockedToCharacter: Boolean? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("nextLevelRequirements")
    var nextLevelRequirements: List<NextLevelRequirement>? = null
    @SerializedName("note")
    var note: String? = null
    @SerializedName("properties")
    var properties: List<Property>? = null
    @SerializedName("requirements")
    var requirements: List<Requirement>? = null
    @SerializedName("secDescrText")
    var secDescrText: String? = null
    @SerializedName("socketedItems")
    var socketedItems: List<Any>? = null
    @SerializedName("sockets")
    var sockets: List<Socket>? = null
    @SerializedName("support")
    var support: Boolean? = null
    @SerializedName("typeLine")
    var typeLine: String? = null
    @SerializedName("utilityMods")
    var utilityMods: List<String>? = null
    @SerializedName("verified")
    var verified: Boolean? = null
    @SerializedName("w")
    var w: Long? = null
    @SerializedName("x")
    var x: Long? = null
    @SerializedName("y")
    var y: Long? = null

}
