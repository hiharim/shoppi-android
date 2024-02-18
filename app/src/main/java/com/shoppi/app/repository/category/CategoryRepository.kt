package com.shoppi.app.repository.category

import com.shoppi.app.model.Category
import com.shoppi.app.repository.category.CategoryRemoteDateSource

class CategoryRepository(
    private val remoteDateSource: CategoryRemoteDateSource
) {

    suspend fun getCategories(): List<Category> {
        return remoteDateSource.getCategories()
    }
}