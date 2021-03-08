package com.example.firststep.fragments.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.firststep.R
import com.example.firststep.data.User
import com.example.firststep.data.UserViewModel
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*
import kotlinx.android.synthetic.main.fragment_list.view.*
import java.lang.Integer.parseInt


class AddFragment : Fragment() {

    private lateinit var mUserViewMdel : UserViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_add, container, false)

        mUserViewMdel = ViewModelProvider(this).get(UserViewModel::class.java)

        view.add_btn.setOnClickListener{
            insertDataToDatabase()
        }


            return view
    }

    private fun insertDataToDatabase() {
val firstName = addFirstName.text.toString()
    val secondName = addSecondName.text.toString()
    val age = addAge.text

        val user = User(0, firstName,secondName,parseInt(age.toString()))
        //add user
        mUserViewMdel.addUser(user)
        Toast.makeText(requireContext(),"Uspesno dodat", Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.action_addFragment_to_listFragment)


    }


}