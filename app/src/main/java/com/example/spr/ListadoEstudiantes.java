package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.spr.ui.login.LoginActivity;


public class ListadoEstudiantes extends AppCompatActivity {

    private View button;
    private TextView textView1;
    private TextView limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_estudiantes);
    }
    public void viewHistorial(View view) {
        //textView1.setText("FUNCIONA");
        switch (view.getId()){

            case R.id.btnHistBackProf:
                Intent intentHist=new Intent(ListadoEstudiantes.this, homeAdmin.class);
                startActivity(intentHist);
                break;
            case R.id.btnHistLogProf:
                Intent intentLogout=new Intent(ListadoEstudiantes.this, LoginActivity.class);
                startActivity(intentLogout);
                break;
            case R.id.ProfDetails:
                Intent intentDetails=new Intent(ListadoEstudiantes.this, MainActivity.class);
                startActivity(intentDetails);
                break;




        }



        // Do something in response to button click
    }
}