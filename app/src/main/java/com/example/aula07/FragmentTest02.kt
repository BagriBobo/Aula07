package com.example.aula07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aula07.databinding.FragmentTest02Binding


class FragmentTest02 : Fragment() {

    lateinit var binding: FragmentTest02Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTest02Binding.inflate(inflater)

        binding.button2.setOnClickListener{
            alert("Olá","Olá do Fragmento 02", requireContext())
        }

        return binding.root
    }



}