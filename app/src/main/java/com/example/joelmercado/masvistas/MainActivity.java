package com.example.joelmercado.masvistas;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by joelmercado on 18/02/18.
 */

public class MainActivity extends Activity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("Mi nueva actividad");
        setContentView(textView);
        setContentView(R.layout.activy_main);
        entrada=(EditText)findViewById(R.id.entrada);
        salida=(TextView)findViewById(R.id.salida);
    }

   /* public void sePulsa(View view){
        Toast.makeText(this,"Pulsado",Toast.LENGTH_SHORT).show();
    }*/

    public void sePulsa(View view){
        salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));
    }

    public void sePulsa0(View view){
        entrada.setText(entrada.getText()+(String)view.getTag());
    }
}
