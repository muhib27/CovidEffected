package com.muhib.covideffected.services

/**
 * Created by User on 5/19/2021.
 */
import com.muhib.covideffected.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {

    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}