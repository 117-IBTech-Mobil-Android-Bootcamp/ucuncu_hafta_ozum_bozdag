package com.info.bootcampweekthree

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class BattleFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.battle_fragment, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity= activity as MainActivity
        activity.showNavigation()


        activity.onBackPressedDispatcher.addCallback(viewLifecycleOwner, object :
        OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                AlertDialog.Builder(requireContext()).setTitle("Uyarı").setMessage("Uygulamadan çıkmak istediğinize emin misiniz?")
                        .setCancelable(false)
                        .setNegativeButton("Evet"){dialogInterface: DialogInterface, i: Int -> activity.finish()}
                        .setPositiveButton("Hayır"){dialog, _-> dialog.dismiss()}.show()
            }
        })
    }
}