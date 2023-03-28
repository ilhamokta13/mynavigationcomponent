package com.example.mynavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavigationcomponent.databinding.FragmentFirstBinding
import com.example.mynavigationcomponent.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btndua.setOnClickListener{
            val nama = binding.etName.text.toString()
            val bund = Bundle()
            bund.putString("NAMA", nama)
            findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment,bund)
        }
    }

}