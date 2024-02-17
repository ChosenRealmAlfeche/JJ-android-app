package com.example.budgetmind.login.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.budgetmind.databinding.ForgotPasswordLayoutBinding


class ForgotPasswordFragment private constructor() : Fragment() {

    companion object {
        fun newInstance() = ForgotPasswordFragment()
    }

    private lateinit var binding: ForgotPasswordLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ForgotPasswordLayoutBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.resetPassword.setOnClickListener {
            Toast
                .makeText(requireContext(), "Sending reset email to: ${binding.email.text}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}