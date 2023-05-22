package com.kustims.a6six

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kustims.a6six.base.BaseFragment
import com.kustims.a6six.databinding.FragmentSaveDetailBinding
import com.kustims.a6six.domain.model.SaveDetail


class SaveDetailFragment : BaseFragment<FragmentSaveDetailBinding>() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter :
    lateinit var recyclerViewData: ArrayList<SaveDetail>

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSaveDetailBinding {
        return FragmentSaveDetailBinding.inflate(inflater, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerViewData = new ArrayList<SaveD>
    }

}

