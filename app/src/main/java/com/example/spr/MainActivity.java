package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.spr.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewHistorial(View view) {
        //textView1.setText("FUNCIONA");
        switch (view.getId()){
            case R.id.btnBackEst:
            case R.id.btnHistoryEst:
                Intent intentHist=new Intent(MainActivity.this, ListadoEstudiantes.class);
                startActivity(intentHist);
                break;

            case R.id.btnLogoutEst:
                Intent intentBack=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intentBack);
                break;
            case R.id.btnUpdateEst:
                Context context= getApplicationContext();
                CharSequence updateMsg = "¡Datos actualizados con éxito!";
                int time = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, updateMsg, time);
                toast.setGravity(Gravity.CENTER, 0, 0 );

                toast.show();
                break;
            case R.id.btndeleteEst:
                Context context2= getApplicationContext();
                CharSequence deleteMsg = "¡Datos eliminados con éxito!";
                int time2 = Toast.LENGTH_LONG;
                Toast toast2 = Toast.makeText(context2, deleteMsg, time2);
                toast2.setGravity(Gravity.CENTER, 0, 0 );

                toast2.show();
                break;


        }

    }

}