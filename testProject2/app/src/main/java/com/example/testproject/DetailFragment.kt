package com.example.testproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testproject.databinding.ActivityOneBinding
import com.example.testproject.databinding.FragmentDetailBinding

class DetailFragment : Fragment(){

    private  lateinit var  viewBinding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.viewBinding = FragmentDetailBinding.inflate(inflater,container,false)
        return this.viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        this.viewBinding.textView.text = "test1";
    }
}