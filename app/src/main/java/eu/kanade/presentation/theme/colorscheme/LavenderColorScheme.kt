package eu.kanade.presentation.theme.colorscheme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Colors for Lavender theme
 * Color scheme by Osyx
 *
 * Key colors:
 * Primary #7DCFFF
 * Secondary #7DCFFF
 * Tertiary #9D7CD8
 * Neutral #24283B
 */
internal object LavenderColorScheme : BaseColorScheme() {

    override val darkScheme = darkColorScheme(
        primary = Color(0xFF7DCFFF),
        onPrimary = Color(0xFF24283B),
        primaryContainer = Color(0xFF7DCFFF),
        onPrimaryContainer = Color(0xFF24283B),
        inversePrimary = Color(0xFF5AF79E),
        secondary = Color(0xFF7DCFFF),
        onSecondary = Color(0xFF24283B),
        secondaryContainer = Color(0xFF7DCFFF),
        onSecondaryContainer = Color(0xFF24283B),
        tertiary = Color(0xFF9D7CD8),
        onTertiary = Color(0xFFF8F8F2),
        tertiaryContainer = Color(0xFF24283B),
        onTertiaryContainer = Color(0xFFC0CAF5),
        background = Color(0xFF24283B),
        onBackground = Color(0xFFC0CAF5),
        surface = Color(0xFF24283B),
        onSurface = Color(0xFFC0CAF5),
        surfaceVariant = Color(0x2CE6E6E6),
        onSurfaceVariant = Color(0xFFF8F8F2),
        surfaceTint = Color(0xFF7DCFFF),
        inverseSurface = Color(0xFF221247),
        inverseOnSurface = Color(0xFFC0CAF5),
        outline = Color(0xA8CAA9FA),
    )

    override val lightScheme = lightColorScheme(
        primary = Color(0xFF7B46AF),
        onPrimary = Color(0xFFEDE2FF),
        primaryContainer = Color(0xFF7B46AF),
        onPrimaryContainer = Color(0xFFEDE2FF),
        inversePrimary = Color(0xFFD6BAFF),
        secondary = Color(0xFF7B46AF),
        onSecondary = Color(0xFFEDE2FF),
        secondaryContainer = Color(0xFF7B46AF),
        onSecondaryContainer = Color(0xFFEDE2FF),
        tertiary = Color(0xFFEDE2FF),
        onTertiary = Color(0xFF7B46AF),
        tertiaryContainer = Color(0xFFEDE2FF),
        onTertiaryContainer = Color(0xFF7B46AF),
        background = Color(0xFFEDE2FF),
        onBackground = Color(0xFF1B1B22),
        surface = Color(0xFFEDE2FF),
        onSurface = Color(0xFF1B1B22),
        surfaceVariant = Color(0xFFB9B0CC),
        onSurfaceVariant = Color(0xD849454E),
        surfaceTint = Color(0xFF7B46AF),
        inverseSurface = Color(0xFF313033),
        inverseOnSurface = Color(0xFFF3EFF4),
        outline = Color(0xFF7B46AF),
    )
}
