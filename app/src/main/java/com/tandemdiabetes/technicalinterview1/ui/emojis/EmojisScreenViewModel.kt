package com.tandemdiabetes.technicalinterview1.ui.emojis

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EmojisScreenViewModel : ViewModel() {

    var state by mutableStateOf(EmojisScreenState())
        private set

}
