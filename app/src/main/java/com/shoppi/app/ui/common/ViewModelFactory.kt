package com.shoppi.app.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shoppi.app.AssetLoader
import com.shoppi.app.repository.HomeAssetDataSource
import com.shoppi.app.repository.HomeRepository
import com.shoppi.app.ui.home.HomeViewModel

// 생성자가 추가된 viewModel 전달하려고
class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    // ViewModel 을 생성하고 반환함
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       if(modelClass.isAssignableFrom(HomeViewModel::class.java)){
           val repository =HomeRepository(HomeAssetDataSource(AssetLoader(context)))
           return HomeViewModel(repository) as T
       }else{
           throw IllegalArgumentException("Failed to create ViewModel : ${modelClass.name}")
       }
    }
}