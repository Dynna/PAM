package com.example.myapplication.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Post(
    @StringRes val stringResourceId: Int,
    @StringRes val strResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
