package com.kkandroid.kretrofit.services

import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Path
import retrofit2.http.QueryMap

/**
 * Retrofit Api接口
 */
interface KRetrofitServices {

    /**
     * Get请求
     * @param path 接口路径，不可为null
     * @param queryMap 请求参数，不可为null
     */
    @GET("{path}")
    fun get(
        @Path(value = "path", encoded = true) path: String,
        @QueryMap queryMap: MutableMap<String, Any>
    ): Call<ResponseBody>

    /**
     * Post请求
     * @param path 接口路径，不可为null
     * @param fieldMap 请求参数，不可为null
     */
    @FormUrlEncoded
    @POST("{path}")
    fun post(
        @Path(value = "path", encoded = true) path: String,
        @FieldMap fieldMap: MutableMap<String, Any>
    ): Call<ResponseBody>

    /**
     * Post请求（文件上传）
     * @param path 接口路径，不可为null
     * @param partMap 请求参数，不可为null
     * @param file 上传文件，不可为null
     */
    @Multipart
    @POST("{path}")
    fun post(
        @Path(value = "path", encoded = true) path: String,
        @PartMap partMap: MutableMap<String, RequestBody>,
        @Part file: MultipartBody.Part
    ): Call<ResponseBody>
}