package com.example.telechamba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun botonCrearProyecto(view : View){
        val CrearProyecto = Intent(this ,CreateProjectActivity::class.java )
        startActivity(CrearProyecto)
    }

    fun botonPerfil(view: View){
        val Perfil = Intent(this , Profile::class.java)
        startActivity(Perfil)
    }

    fun botonSalir(view: View){
        finish()
    }
}