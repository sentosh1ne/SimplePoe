package model.ladder

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

class Character(var charClass: String?,var experience: Long?, var level: Long?, var name: String?){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Character

        if (charClass != other.charClass) return false
        if (experience != other.experience) return false
        if (level != other.level) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = charClass?.hashCode() ?: 0
        result = 31 * result + (experience?.hashCode() ?: 0)
        result = 31 * result + (level?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }
}
