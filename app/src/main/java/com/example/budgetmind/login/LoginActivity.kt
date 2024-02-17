package com.example.budgetmind.login

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import com.example.budgetmind.R
import com.example.budgetmind.databinding.LoginLayoutBinding
import com.example.budgetmind.login.fragments.ForgotPasswordFragment
import com.example.budgetmind.login.fragments.LoginFragment
import com.example.budgetmind.login.fragments.SignUpFragment

class LoginActivity : FragmentActivity() {

    private lateinit var binding: LoginLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity_layout)
        openLoginPage()
    }

    fun openForgotPasswordPage() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container, ForgotPasswordFragment.newInstance())
            addToBackStack(null)
        }
    }

    fun openSignUpPage() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container, SignUpFragment.newInstance())
            addToBackStack(null)
        }
    }

    fun openLoginPage() {
        supportFragmentManager.popBackStackImmediate()
        supportFragmentManager.commit {
            replace(R.id.fragment_container, LoginFragment.newInstance())
            disallowAddToBackStack()
        }
    }
}