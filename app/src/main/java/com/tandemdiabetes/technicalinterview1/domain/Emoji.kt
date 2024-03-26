package com.tandemdiabetes.technicalinterview1.domain

data class Emoji(
    val name: String,
    val category: String,
    val group: String,
    val htmlCode: List<String>,
    val unicode: List<String>
) {
    // Use this function to display the emoji in a Text field
    val emoji: String
        get() = StringBuilder()
            .appendCodePoint(
                Integer.decode(
                    unicode[0].replace( "U+" , "0x" )
                )
            )
            .toString()
}
