package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.spr.ui.login.LoginActivity;

public class AdminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
    }
    public void viewHistorial(View view) {
        //textView1.setText("FUNCIONA");
        switch (view.getId()){

            case R.id.profWindow:
                Intent intentHist=new Intent(AdminHome.this,  ListadoProfes.class);
                startActivity(intentHist);
                break;
            case R.id.EstWindow:
                Intent intentLogout=new Intent(AdminHome.this, ListadoEstudiantes.class);
                startActivity(intentLogout);
                break;

        }



        // Do something in response to button click
    }
}