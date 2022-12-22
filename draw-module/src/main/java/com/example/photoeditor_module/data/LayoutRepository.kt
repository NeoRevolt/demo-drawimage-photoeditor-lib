package com.example.photoeditor_module.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.photoeditor_module.data.offline.entity.LayoutEntity
import com.example.photoeditor_module.data.offline.entity.TransactionEntity
import com.example.photoeditor_module.data.offline.room.LayoutDao

class LayoutRepository constructor(
    private val layoutDao: LayoutDao
) {
    private val result = MediatorLiveData<Result<List<LayoutEntity>>>()

    val readAllTransactions: LiveData<List<TransactionEntity>> = layoutDao.getTransaction()
    val readAllLayout: LiveData<List<LayoutEntity>> = layoutDao.getLayout()

    suspend fun addAllTransaction(transaction: TransactionEntity) {
        layoutDao.insertTransaction(transaction)
    }

    suspend fun addAllLayout(layout: LayoutEntity) {
        layoutDao.insertLayout(layout)
    }

    fun deleteTransaction() {
        layoutDao.deleteAllTransaction()
    }

    fun deleteLayout() {
        layoutDao.deleteAllLayout()
    }
}