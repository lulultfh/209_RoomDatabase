package com.example.prak7_209.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.prak7_209.repository.AplikasiSiswa
import com.example.prak7_209.viewmodel.HomeViewModel

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa=
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as AplikasiSiswa)