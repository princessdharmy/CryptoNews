package com.princess.android.cryptonews.injection;

import android.content.Context;

import com.princess.android.cryptonews.AppController;

import dagger.Module;
import dagger.Provides;

/**
 * Created by numb3rs on 2/20/18.
 */

@Module
public class CryptoNewsModule {
    private AppController appController;

    public CryptoNewsModule(AppController appController) {
        this.appController = appController;
    }


    @Provides
    Context provideApplicationContext() {
        return  appController;
    }


}