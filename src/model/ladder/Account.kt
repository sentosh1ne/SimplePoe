package model.ladder

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

class Account(var challenges: Challenges?, var name: String?, var twitch: Twitch?){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Account

        if (challenges != other.challenges) return false
        if (name != other.name) return false
        if (twitch != other.twitch) return false

        return true
    }

    override fun hashCode(): Int {
        var result = challenges?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (twitch?.hashCode() ?: 0)
        return result
    }
}
