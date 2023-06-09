package com.kustims.a6six.ui.fragment.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kustims.a6six.R
import com.kustims.a6six.base.BaseFragment
import com.kustims.a6six.databinding.FragmentSettingsMypageBinding


class SettingsMypageFragment : BaseFragment<FragmentSettingsMypageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSettingsMypageBinding {
        return FragmentSettingsMypageBinding.inflate(inflater,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvEditProfileMypageSetting.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fcv_main, AccountEditMypageFragment())
                .addToBackStack(null)
                .commit()

        }

    }



}