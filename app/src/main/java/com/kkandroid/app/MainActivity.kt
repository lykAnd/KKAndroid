package com.kkandroid.app

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kkandroid.kretrofit.services.KRetrofitServices
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    private val services: KRetrofitServices
        get() {
            val create =
                Retrofit.Builder().baseUrl("http://api.597.cs/").build().create<KRetrofitServices>()
            return create
        }

    private val callback = object : Callback<ResponseBody> {
        override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
            Log.e("TAG", "onResponse: $response")
        }

        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            Log.e("TAG", "onFailure: $t")
        }

    }

    fun click1(view: View) {
        services.get("", mutableMapOf()).enqueue(callback)
    }

    fun click2(view: View) {
        services.post("", mutableMapOf()).enqueue(callback)
    }

    fun click3(view: View) {
        val part = MultipartBody.Part.createFormData("", "")
        services.post("", mutableMapOf(), part).enqueue(callback)
    }
}