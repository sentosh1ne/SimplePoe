package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
class Challenges(var total: Long?) {
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Challenges

        if (total != other.total) return false

        return true
    }

    override fun hashCode(): Int {
        return total?.hashCode() ?: 0
    }
}
