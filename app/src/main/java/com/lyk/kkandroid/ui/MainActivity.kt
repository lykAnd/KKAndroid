package com.lyk.kkandroid.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lyk.kkandroid.ui.test.PositionItem
import com.lyk.kkandroid.ui.theme.KKAndroidTheme

class MainActivity : ComponentActivity() {

    private val names: List<String> = ArrayList<String>().apply {
        add("Android")
        add("Java")
        add("Kotlin")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KKAndroidTheme {
                // A surface container using the 'background' color from the theme
                PositionItem()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KKAndroidTheme {
        PositionItem()
    }
}