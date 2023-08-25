package ru.vdh.learnapp.newfeature.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.vdh.learnapp.newfeature.domain.usecase.GetNewFeatureUseCase
import ru.vdh.learnapp.newfeature.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.learnapp.newfeature.presentation.mapper.NewFeaturePresentationToDomainMapper
import javax.inject.Inject

@HiltViewModel
class NewFeatureViewModel @Inject constructor(
    private val getNewFeatureUseCase: GetNewFeatureUseCase,
    private val newFeaturePresentationToDomainMapper: NewFeaturePresentationToDomainMapper,
    private val newFeatureDomainToPresentationMapper: NewFeatureDomainToPresentationMapper
) : ViewModel() {

    private val resultMutableLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = resultMutableLiveData

    init {
        Log.e("AAA", "UserDetailsViewModel created!!!")
    }

    fun load() {
        val userName = getNewFeatureUseCase.invoke()
        resultMutableLiveData.value = "${userName.firstName} ${userName.lastName}"
    }
}