package com.song2.mygitapp.util

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:background_grade")
fun setGrade(view: View, grade: Int) {
    view.setBackgroundColor(Color.argb(((grade*100)),200, 200, 200))
}

@BindingAdapter("app:setImage")
fun setImageUrl(view: ImageView, profile: String) {
    Glide.with(view.context)
        .load(profile)
        .into(view)
}
