package com.example.myapplication

import android.R
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.myapplication.R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val editText = view.findViewById<EditText>(R.id.editText)

        val txtPinEntry = view.findViewById<PinEntryEditText>(com.example.myapplication.R.id.txt_pin_entry)
        txtPinEntry.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (s?.toString() == "1234") {
                    Toast.makeText(activity, "Success", Toast.LENGTH_SHORT).show()
                } else if (s?.length == "1234".length) {
                    Toast.makeText(activity, "Incorrect", Toast.LENGTH_SHORT).show()
                    txtPinEntry.text = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })

        view.findViewById<Button>(com.example.myapplication.R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            //val text = editText.text

            // Showing the user input
            //Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()

        }
    }
}