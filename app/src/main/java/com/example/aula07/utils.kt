package com.example.aula07

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun alert(title: String, msg: String, ctx: Context) {
    AlertDialog.Builder(ctx)
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("OK", null)
        .create()
        .show()
}