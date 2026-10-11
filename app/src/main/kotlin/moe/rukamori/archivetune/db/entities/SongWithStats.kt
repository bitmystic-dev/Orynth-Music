/*
 * Orynth Music (2026)
 * © BitMystic — github.com/bitmystic-dev
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.db.entities

import androidx.compose.runtime.Immutable

@Immutable
data class SongWithStats(
    val id: String,
    val title: String,
    val thumbnailUrl: String?,
    val songCountListened: Int,
    val timeListened: Long?,
)
