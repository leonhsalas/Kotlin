package com.example.view_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MyViewModel:ViewModel() {
    private val _myName: MutableLiveData<String> = MutableLiveData("")
    val myName: LiveData<String> = _myName

    fun setMyName(myName: String) {
        _myName.value = myName
    }
}