package com.shoppi.app

import android.content.Context
import android.util.Log

class AssetLoader(private val context: Context) {

    fun getJsonString(fileName : String) : String? {
        return kotlin.runCatching {
            loadAsset(fileName)
        }.getOrNull()
    }

    private fun loadAsset(fileName : String) : String{
        return context.assets.open(fileName).use { inputStream ->
            val size = inputStream.available() //inputStream 에 데이터가 존재하는지는 available 메소드 를 통해 확인
            val bytes = ByteArray(size)
            inputStream.read(bytes)
            String(bytes)
        }
    }
}