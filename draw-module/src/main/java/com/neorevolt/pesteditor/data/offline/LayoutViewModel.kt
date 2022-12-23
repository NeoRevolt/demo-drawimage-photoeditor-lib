package com.neorevolt.pesteditor.data.offline

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.neorevolt.pesteditor.data.LayoutRepository
import com.neorevolt.pesteditor.data.offline.entity.LayoutEntity
import com.neorevolt.pesteditor.data.offline.entity.TransactionEntity
import com.neorevolt.pesteditor.data.offline.room.IconsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LayoutViewModel(application: Application) : AndroidViewModel(application) {
    val readAllLayout: LiveData<List<LayoutEntity>>
    val readAllTransaction: LiveData<List<TransactionEntity>>
    private val layoutRepository: LayoutRepository

    init {
        val layoutDao = IconsDatabase.getInstance(application).layoutDao()
        layoutRepository = LayoutRepository(layoutDao)

        readAllLayout = layoutRepository.readAllLayout
        readAllTransaction = layoutRepository.readAllTransactions
    }

    fun addLayout(layout: LayoutEntity){
        viewModelScope.launch(Dispatchers.IO){
            layoutRepository.addAllLayout(layout)
        }
    }
    fun addTransaction(transaction: TransactionEntity){
        viewModelScope.launch(Dispatchers.IO){
            layoutRepository.addAllTransaction(transaction)
        }
    }


    fun deleteLayoutFromDB(){
        viewModelScope.launch(Dispatchers.IO){
            layoutRepository.deleteLayout()
        }
    }
    fun deleteTransactionFromDB(){
        viewModelScope.launch(Dispatchers.IO){
            layoutRepository.deleteTransaction()
        }
    }

}