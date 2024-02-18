package com.shoppi.app.repository.category

import com.shoppi.app.model.Category
import com.shoppi.app.network.ApiClient
import com.shoppi.app.repository.category.CategoryDataSource

class CategoryRemoteDateSource(private val apiClient: ApiClient) : CategoryDataSource {
    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}