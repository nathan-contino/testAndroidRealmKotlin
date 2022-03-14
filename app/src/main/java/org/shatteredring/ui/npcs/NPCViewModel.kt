package org.shatteredring.ui.npcs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NPCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is npc Fragment"
    }
    val text: LiveData<String> = _text
}