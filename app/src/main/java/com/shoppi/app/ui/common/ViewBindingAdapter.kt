package com.shoppi.app.ui.common

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("isVisible")
fun updateVisibility(view: View, isVisible :Boolean) {
    view.visibility = if(isVisible) View.VISIBLE else View.GONE
}
