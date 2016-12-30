package model.ladder

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

class Entry(var account: Account?, var character: Character?, var dead: Boolean?,
            var online: Boolean?, var rank: Long?) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Entry

        if (account != other.account) return false
        if (character != other.character) return false
        if (dead != other.dead) return false
        if (online != other.online) return false
        if (rank != other.rank) return false

        return true
    }

    override fun hashCode(): Int {
        var result = account?.hashCode() ?: 0
        result = 31 * result + (character?.hashCode() ?: 0)
        result = 31 * result + (dead?.hashCode() ?: 0)
        result = 31 * result + (online?.hashCode() ?: 0)
        result = 31 * result + (rank?.hashCode() ?: 0)
        return result
    }
}

