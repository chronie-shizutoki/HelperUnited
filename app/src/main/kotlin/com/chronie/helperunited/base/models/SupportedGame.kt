package com.chronie.helperunited.base.models

import com.chronie.helperunited.R

enum class SupportedGame(
    val rawValue: String,
    val hoyoBizId: String,
    val uidPrefix: String,
    val displayNameResId: Int
) {
    GENSHIN_IMPACT("GI", "hk4e", "GI", R.string.game_genshin_name),
    STAR_RAIL("HSR", "hkrpg", "SR", R.string.game_starrail_name),
    ZENLESS_ZONE("ZZZ", "nap", "ZZ", R.string.game_zenlesszone_name);

    val id: String get() = rawValue

    fun withUid(uid: String): String = "$uidPrefix-$uid"

    companion object {
        fun fromRawValue(rawValue: String): SupportedGame? {
            return values().find { it.rawValue == rawValue }
        }
        
        fun fromUidPrefix(prefix: String): SupportedGame? {
            return values().find { it.uidPrefix == prefix }
        }
    }
}
