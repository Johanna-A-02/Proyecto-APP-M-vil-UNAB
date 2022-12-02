package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.spr.ui.login.LoginActivity;

public class homeAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
    }
    public void viewHistorial(View view) {
        //textView1.setText("FUNCIONA");
        switch (view.getId()){
            //case R.id.estDetails:
            case R.id.profes:
                Intent intentHist=new Intent(homeAdmin.this, ListadoProfes.class);
                startActivity(intentHist);
                break;
            case R.id.estudiantes:
                Intent intentLogout=new Intent(homeAdmin.this, ListadoEstudiantes.class);
                startActivity(intentLogout);
                break;

        }



        // Do something in response to button click
    }
}