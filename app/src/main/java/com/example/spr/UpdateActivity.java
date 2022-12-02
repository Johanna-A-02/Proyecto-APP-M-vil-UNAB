package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }




    private View.OnClickListener UpdateActivity = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnUpdateEst:
                    Log.d("MainActivity", "BTN UPDATE");
                    break;
                case R.id.btndeleteEst:
                     Log.d("MainActivity", "BTN DELETE");
                     break;



                default:
                    break;
            }
        }
    };

}