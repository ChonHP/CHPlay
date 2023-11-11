package com.example.chplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ItemFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView : View =  inflater.inflate(R.layout.fragment_item, container, false)
        val recyclerview = rootView.findViewById<RecyclerView>(R.id.recyclerview)
        val recyclerview1 = rootView.findViewById<RecyclerView>(R.id.recyclerview1)
        val recyclerview3 = rootView.findViewById<RecyclerView>(R.id.recyclerview3)
        recyclerview.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        val data = ArrayList<ItemViewModel>()
        for (i in 1..5) {
            data.add(ItemViewModel(androidx.core.R.drawable.ic_call_answer, "Item " + i, "4.1"))
        }
        val adapter = CustomClassAdapter(data)
        recyclerview.adapter = adapter

        recyclerview1.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        val data1 = ArrayList<ItemViewModel>()
        for (i in 1..5) {
            data1.add(ItemViewModel(R.drawable.baseline_arrow_forward_24, "Hello " + i, "4.2"))
        }
        val adapter1 = CustomClassAdapter(data1)
        recyclerview1.adapter = adapter1

        recyclerview3.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        val data3 = ArrayList<ItemViewModel>()
        for (i in 1..5) {
            data3.add(ItemViewModel(R.drawable.baseline_apps_24, "World " + i, "4.3"))
        }
        val adapter3 = CustomClassAdapter(data3)
        recyclerview3.adapter = adapter3

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ItemFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ItemFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}