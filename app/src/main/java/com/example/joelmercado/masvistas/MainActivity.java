package com.example.joelmercado.masvistas;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by joelmercado on 18/02/18.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView textView=new TextView(this);
        textView.setText("Mi nueva actividad");
        setContentView(textView);*/
        setContentView(R.layout.activy_main);
    }

    public void sePulsa(View view){
        Toast.makeText(this,"Pulsado",Toast.LENGTH_SHORT).show();
    }
}
