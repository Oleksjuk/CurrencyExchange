package com.itstep.currencyexchange.network;

import com.itstep.currencyexchange.network.Currency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MonoAPI {

    @GET("/bank/currency")
    public Call<List<Currency>> getCurrencies();

}
