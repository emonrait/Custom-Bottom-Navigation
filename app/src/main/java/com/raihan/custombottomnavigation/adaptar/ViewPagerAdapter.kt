package com.raihan.custombottomnavigation.adaptar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.raihan.custombottomnavigation.fragment.*


class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Home()
            1 -> Statement()
            2 -> QRPay()
            3 -> Beneficiary()
            else -> Menu()
        }
    }

    override fun getCount(): Int {
        return 5
    }

}