package com.example.prak7_209.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.prak7_209.repository.AplikasiSiswa
import com.example.prak7_209.viewmodel.DetailViewModel
import com.example.prak7_209.viewmodel.EntryViewModel
import com.example.prak7_209.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        //tambahan
        initializer {
            DetailViewModel(this.createSavedStateHandle(),aplikasiSiswa().container.repositoriSiswa)
        }
//        initializer {
//            EditViewModel(this.createSavedStateHandle(), aplikasiSiswa().container.repositoriSiswa)
//        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa=
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as AplikasiSiswa)