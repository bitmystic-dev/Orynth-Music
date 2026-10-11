/*
 * Orynth Music (2026)
 * © BitMystic — github.com/bitmystic-dev
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.spotify.models

import kotlinx.serialization.Serializable

@Serializable
data class SpotifySearchResult(
    val tracks: SpotifyPaging<SpotifyTrack>? = null,
    val playlists: SpotifyPaging<SpotifyPlaylist>? = null,
    val albums: SpotifyPaging<SpotifyAlbum>? = null,
    val artists: SpotifyPaging<SpotifyArtist>? = null,
)
