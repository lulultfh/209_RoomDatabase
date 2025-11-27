package com.example.prak7_209.repository

import android.app.Application
import android.content.Context
import com.example.prak7_209.room.DatabaseSiswa

interface ContainerApp{
    val repositoriSiswa: RepositoriSiswa
//    val RepositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}