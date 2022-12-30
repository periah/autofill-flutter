package com.example.autofill_flutter

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView
import android.text.InputType
import android.view.Gravity
import android.widget.EditText

internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) :
    PlatformView {
    private val textView: EditText

    override fun getView(): View {
        return textView
    }

    override fun dispose() {}

    init {
        textView = android.widget.EditText(context)
        textView.setHint("username")
        textView.setAutofillHints(android.view.View.AUTOFILL_HINT_EMAIL_ADDRESS)
        textView.setBackgroundColor(Color.rgb(230, 230, 250))
        textView.setGravity(android.view.Gravity.CENTER)

    }
}
