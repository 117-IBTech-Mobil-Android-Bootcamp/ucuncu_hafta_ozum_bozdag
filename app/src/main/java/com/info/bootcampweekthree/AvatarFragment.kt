package com.info.bootcampweekthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.avatar_fragment.*

class AvatarFragment: Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.avatar_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareView()
    }

    private fun prepareView(){
        val icon1 = Avatar(R.drawable.ic_avatar_1)
        val icon2 = Avatar(R.drawable.ic_avatar_2)
        val icon3 = Avatar(R.drawable.ic_avatar_3)
        val icon4 = Avatar(R.drawable.ic_avatar_4)
        val icon5 = Avatar(R.drawable.ic_avatar_5)
        val icon6 = Avatar(R.drawable.ic_man_avatar)
        val icon7 = Avatar(R.drawable.ic_avatar_7)
        val icon8 = Avatar(R.drawable.ic_avatar_8)
        val icon9 = Avatar(R.drawable.ic_group_78)


        val list = listOf(icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9)

        recyclerView.layoutManager=GridLayoutManager(this.requireContext(), 3, GridLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = Adapter(list)
    }
}