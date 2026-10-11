/*
 * Orynth Music (2026)
 * © BitMystic — github.com/bitmystic-dev
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.privacy

import javax.inject.Inject

class ResetListeningStatsUseCase @Inject constructor(
    private val repository: ListeningStatsRepository,
) {
    suspend operator fun invoke() = repository.reset()
}
