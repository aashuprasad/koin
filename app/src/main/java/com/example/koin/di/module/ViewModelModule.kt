package com.example.koin.di.module

import com.example.koin.ui.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module{
    viewModel{
        MainViewModel(get(), get())
    }
}