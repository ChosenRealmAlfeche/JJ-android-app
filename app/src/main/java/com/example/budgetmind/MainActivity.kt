package com.example.budgetmind

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_menu)
    }

    fun loadRecoverLayout(v: View) {
        setContentView(R.layout.recover_acc_menu)

    }

    fun loadLogInLayout(v: View) {
        setContentView(R.layout.log_in_menu)

    }


}