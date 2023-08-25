package ru.vdh.learnapp.card.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.vdh.learnapp.card.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.learnapp.card.presentation.mapper.NewFeaturePresentationToDomainMapper
import javax.inject.Inject

@HiltViewModel
class SecondFeatureFragmentViewModel @Inject constructor(
    private val newFeaturePresentationToDomainMapper: NewFeaturePresentationToDomainMapper,
    private val newFeatureDomainToPresentationMapper: NewFeatureDomainToPresentationMapper
) : ViewModel() {

    private val resultMutableLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = resultMutableLiveData

    init {
        Log.e("AAA", "UserDetailsViewModel created!!!")
    }
}