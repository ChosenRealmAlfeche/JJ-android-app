package com.example.budgetmind.login.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.budgetmind.databinding.SignUpLayoutBinding
import com.example.budgetmind.login.LoginActivity

class SignUpFragment private constructor() : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private lateinit var binding: SignUpLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = SignUpLayoutBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.forgotPassword.setOnClickListener {
            (requireActivity() as LoginActivity).openForgotPasswordPage()
        }
        binding.loginInstead.setOnClickListener {
            (requireActivity() as LoginActivity).openLoginPage()
        }
        binding.signUp.setOnClickListener {
            Toast
                .makeText(requireContext(), "Signing up ${binding.username.text}...", Toast.LENGTH_SHORT)
                .show()
        }
    }
}