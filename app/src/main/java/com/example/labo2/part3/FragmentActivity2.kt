package com.example.labo2.part3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.labo2.R

class FragmentActivity2 : Fragment() {

    private var counter : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            counter = it.getInt(STACK_COUNT)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val counterView = view.findViewById<TextView>(R.id.f_counter)
        counterView.text = "$counter"
    }



    companion object {
        private const val STACK_COUNT = "stack_count"

        @JvmStatic
        fun newInstance(stackCount: Int = 0) =
            FragmentActivity2().apply {
                arguments = Bundle().apply {
                    putInt(STACK_COUNT, stackCount)
                }
            }
    }
}