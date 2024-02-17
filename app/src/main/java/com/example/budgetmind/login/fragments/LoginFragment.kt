package com.example.budgetmind.login.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.budgetmind.databinding.LoginLayoutBinding
import com.example.budgetmind.login.LoginActivity

class LoginFragment private constructor() : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var binding: LoginLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = LoginLayoutBinding.inflate(inflater, container, false)
        .also {
            binding = it
        }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.forgotPassword.setOnClickListener {
            (requireActivity() as LoginActivity).openForgotPasswordPage()
        }
        binding.signUpInstead.setOnClickListener {
            (requireActivity() as LoginActivity).openSignUpPage()
        }
        binding.loginButton.setOnClickListener {
            Toast
                .makeText(requireContext(), "Trying to login with: ${binding.username.text}", Toast.LENGTH_SHORT)
                .show()
        }

    }
}