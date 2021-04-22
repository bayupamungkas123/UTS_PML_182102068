package com.pamungkasbayuajie.pml_uts_182102068.service;

import com.pamungkasbayuajie.pml_uts_182102068.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
