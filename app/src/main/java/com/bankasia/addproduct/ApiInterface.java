package com.bankasia.addproduct;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @Multipart
    @POST("upload2")
    Call<ResponseBody> uploadMultiple(
            @Part("name") RequestBody name,
            @Part List<MultipartBody.Part> parts);
}
