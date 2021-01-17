package com.example.android.boardgamesaver.taintedgrail.ui.heroes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class HeroesViewModel : ViewModel() {

    private val _beorName = MutableLiveData<String>().apply { value = "Beor"}
    private val _aileiName = MutableLiveData<String>().apply { value = "Ailei"}
    private val _arevName = MutableLiveData<String>().apply { value = "Arev"}
    private val _maggotName = MutableLiveData<String>().apply { value = "Maggot"}

    //private val _beorPlayerName = MutableLiveData<String>().apply { value = "Test Player" }

    private val _beorAggression = MutableLiveData<Int>().apply { value = 0 }
    private val _beorEmpathy = MutableLiveData<Int>().apply { value = 0 }

    private val _beorCourage = MutableLiveData<Int>().apply { value = 0 }
    private val _beorCaution = MutableLiveData<Int>().apply { value = 0 }

    private val _beorPracticality = MutableLiveData<Int>().apply { value = 0 }
    private val _beorSpirituality = MutableLiveData<Int>().apply { value = 0 }

    private val _beorEnergy = MutableLiveData<Int>().apply { value = 0 }
    private val _beorHealth = MutableLiveData<Int>().apply { value = 0 }
    private val _beorTerror = MutableLiveData<Int>().apply { value = 0 }

    private val _beorFood = MutableLiveData<Int>().apply { value = 0 }
    private val _beorWealth = MutableLiveData<Int>().apply { value = 0 }
    private val _beorRep = MutableLiveData<Int>().apply { value = 0 }
    private val _beorExp = MutableLiveData<Int>().apply { value = 0 }
    private val _beorMagic = MutableLiveData<Int>().apply { value = 0 }

    private val _beorNotes = MutableLiveData<String>().apply { value = "Test Note /n/n Test Test" }

    val beorName: LiveData<String> = _beorName
    val aileiName: LiveData<String> = _aileiName
    val arevName: LiveData<String> = _arevName
    val maggotName: LiveData<String> = _maggotName

    //val beorPlayerName: LiveData<String> = _beorPlayerName

    val beorAggression: LiveData<Int> = _beorAggression
    val beorEmpathy: LiveData<Int> = _beorEmpathy

    val beorCourage: LiveData<Int> = _beorCourage
    val beorCaution: LiveData<Int> = _beorCaution

    val beorPracticality: LiveData<Int> = _beorPracticality
    val beorSpirituality: LiveData<Int> = _beorSpirituality

    val beorEnergy: LiveData<Int> = _beorEnergy
    val beorHealth: LiveData<Int> = _beorHealth
    val beorTerror: LiveData<Int> = _beorTerror

    val beorFood: LiveData<Int> = _beorFood
    val beorWealth: LiveData<Int> = _beorWealth
    val beorRep: LiveData<Int> = _beorRep
    val beorExp: LiveData<Int> = _beorExp
    val beorMagic: LiveData<Int> = _beorMagic

    val beorNotes: LiveData<String> = _beorNotes

}
