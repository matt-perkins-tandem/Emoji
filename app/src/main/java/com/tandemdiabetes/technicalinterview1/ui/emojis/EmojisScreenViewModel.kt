package com.tandemdiabetes.technicalinterview1.ui.emojis

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tandemdiabetes.technicalinterview1.data.EmojiRepositoryImpl
import com.tandemdiabetes.technicalinterview1.domain.EmojiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EmojisScreenViewModel @Inject constructor(private val emojiRepository: EmojiRepository) :
    ViewModel() {

    var state by mutableStateOf(EmojisScreenState())
        private set

    init {
        getEmoji()
    }

    private fun getEmoji() {
        state = EmojisScreenState(isLoading = true)
        viewModelScope.launch {
            val fetchAllEmojis = emojiRepository.fetchAllEmojis()
            if (fetchAllEmojis.isSuccess) {
                val emojiList = fetchAllEmojis.getOrDefault(emptyList())
                val stateValue = EmojisScreenState(isLoading = false, emoji = emojiList)
                state = stateValue
            } else {
                state = EmojisScreenState(isLoading = false)
            }
        }
    }
}
