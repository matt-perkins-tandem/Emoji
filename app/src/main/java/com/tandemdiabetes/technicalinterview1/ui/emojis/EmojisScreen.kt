package com.tandemdiabetes.technicalinterview1.ui.emojis

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tandemdiabetes.technicalinterview1.domain.Emoji

@Composable
fun EmojisScreen() {
    TODO("Implement the UI")
    // 1 - The screen should display a Centered progress bar while the application if fetching the data
    // 2 - When the data is retrieved, we should see a list of Emojis. Each item should have the emoji itself and the name of the emoji
}


@Composable
fun EmojiRow(emoji: Emoji) {
    // Use this to when creating the list of emoji's.
    // Feel free to make it look prettier if you'd like
    Row {
        Text(text = emoji.character)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = emoji.unicodeName)
    }
}

@Preview
@Composable
fun EmojiRowPreview() {
    val emoji = Emoji(
        slug = "grinning-face-with-big-eyes",
        character = "\ud83d\ude03",
        unicodeName = "grinning face with big eyes",
        codePoint = "1F603",
        group = "smileys-emotion",
        subGroup = "face-smiling"
    )
    EmojiRow(emoji)
}
