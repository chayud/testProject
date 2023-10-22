package com.example.testproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testproject.databinding.FragmentDetail2Binding


class DetailFragment2: Fragment() {
    private  lateinit var  viewBinding2: FragmentDetail2Binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.viewBinding2 = FragmentDetail2Binding.inflate(inflater,container,false)
        return this.viewBinding2.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        this.viewBinding2.textView2.text = "test2";
    }

}