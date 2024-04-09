package com.tandemdiabetes.technicalinterview1.ui.emojis

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tandemdiabetes.technicalinterview1.domain.Emoji

@Composable
fun EmojisScreen() {
    TODO("Implement the UI")
    // 1 - The screen should display a Centered progress bar while the application if fetching the data
    // 2 - When the data is retrieved, we should see a list of Emojis. Each item should have the emoji itself and the name of the emoji
}

@Composable
fun EmojiRow(emoji: Emoji) {
    //TODO: Use this to when creating the list of emoji's.  Feel free to make it look prettier if you'd like
    Row {
        Column {
            Text(text = emoji.emoji)
        }
        Column {
            Text(text = emoji.name)
        }
    }
}

@Preview
@Composable
fun EmojiRowPreview() {
    val emoji = Emoji(
        name = "grinning face",
        category = "smileys and people",
        group = "face positive",
        htmlCode = listOf("$#128512;"),
        unicode = listOf("U+1F600")
    )
    EmojiRow(emoji)
}
