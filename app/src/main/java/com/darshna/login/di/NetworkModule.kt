package com.darshna.login.di

import com.darshna.login.network.*
import com.darshna.login.utility.Constants
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object NetworkModule {

  @Provides
  @Singleton
  internal fun provideRetrofit(): Retrofit =
      Retrofit.Builder()
          .baseUrl(Constants.PAN_BASE_URL)
          .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
          .addConverterFactory(GsonConverterFactory.create())
          .build()

  @Reusable
  @Provides
  @JvmStatic
  internal fun providePanLoginService(retrofit: Retrofit): PanLoginService =
      retrofit.create(PanLoginService::class.java)

}