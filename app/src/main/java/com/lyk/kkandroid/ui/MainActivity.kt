package com.lyk.kkandroid.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.lyk.kkandroid.ui.theme.KKAndroidTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KKAndroidTheme {
                Column {
//                    ScrollRow()
//                    ScrollColumn()
                    NestedScrollRow()
                    NestedScrollColumn()
                }
            }
        }
    }
}
