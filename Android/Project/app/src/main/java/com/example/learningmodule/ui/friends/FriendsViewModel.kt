package com.example.learningmodule.ui.friends

import android.os.Parcelable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class FriendsViewModel : ViewModel() {

    private val _data = MutableLiveData<List<String>>().apply {
        value = IntRange(1, 30).toList().map {
            it.toString()
        }
    }

    // TODO: Implement the following members of FriendsViewModel
    val data
    val dataSize
    fun addAFriend()
}