package com.example.citys.ciudadfavorita

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int
)