package com.example.wetherappnew

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wetherappnew.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}