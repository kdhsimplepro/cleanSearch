package com.wotin.cleansearch.Extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.onEditTextChanged(function: (Editable?) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            function(s)
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }
    })
}