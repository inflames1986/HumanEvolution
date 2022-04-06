package com.inflames1986.humanevolution.viewmodel

import com.inflames1986.humanevolution.entities.WalkParameters

sealed class HumanCondition {
    data class Walk(val walkData: List<WalkParameters>) : HumanCondition()
    data class Error(val Error: Throwable) : HumanCondition()
    object Loading : HumanCondition()
}