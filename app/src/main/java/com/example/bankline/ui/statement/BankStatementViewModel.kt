package com.example.bankline.ui.statement

import androidx.lifecycle.ViewModel
import com.example.bankline.data.BanklineReposity

class BankStatementViewModel: ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineReposity.findBankStatement(accountHolderId)

}