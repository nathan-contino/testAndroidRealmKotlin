package org.shatteredring.ui.quests

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuestModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is quest Fragment"
    }
    val text: LiveData<String> = _text
}