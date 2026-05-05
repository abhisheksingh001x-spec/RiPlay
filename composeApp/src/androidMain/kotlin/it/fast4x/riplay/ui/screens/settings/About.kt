package it.fast4x.riplay.ui.screens.settings

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import it.fast4x.riplay.BuildConfig
import it.fast4x.riplay.ui.styling.secondary
import it.fast4x.riplay.utils.typography

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun About() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0F0F0F),
                        Color(0xFF1A1A1A),
                        Color(0xFF000000)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // 🎵 Title
            BasicText(
                text = "ABHI MUSIC 🎧",
                style = typography().xxl,
            )

            Spacer(modifier = Modifier.height(10.dp))

            BasicText(
                text = "Version ${BuildConfig.VERSION_NAME}",
                style = typography().s.secondary,
            )

            Spacer(modifier = Modifier.height(40.dp))

            // 🔥 GLASS CARD
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(25.dp))
                    .background(
                        Color.White.copy(alpha = 0.08f)
                    )
                    .blur(0.5.dp) // slight glass effect
                    .padding(24.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    BasicText(
                        text = "A modern & smooth music experience",
                        style = typography().s,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    BasicText(
                        text = "Designed & Developed by Abhi ❤️",
                        style = typography().s.secondary,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            BasicText(
                text = "Enjoy the vibe ✨",
                style = typography().xs.secondary,
            )
        }
    }
}
