package com.example.lab07_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar1)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNav1)
        toolbar.title = "FRAGMENTO 01 ACTIVO"
        supportActionBar?.title = "Título de la Actividad"
        supportFragmentManager.beginTransaction().add(R.id.frame1, Fragment1()).commit()
        // Configurar un listener para manejar los cambios de selección

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menufragmento1 -> {
                    supportFragmentManager.beginTransaction().add(R.id.frame1, Fragment1()).commit()
                    toolbar.title = "FRAGMENTO 01 ACTIVO"
                    true
                }

                R.id.menufragmento2 -> {
                    supportFragmentManager.beginTransaction().add(R.id.frame1, Fragment2()).commit()
                    toolbar.title = "FRAGMENTO 02 ACTIVO"
                    true
                }

                R.id.menufragmento3 -> {
                    supportFragmentManager.beginTransaction().add(R.id.frame1, Fragment3()).commit()
                    toolbar.title = "FRAGMENTO 03 ACTIVO"
                    true
                }

                else -> false
            }
        }

    }
}