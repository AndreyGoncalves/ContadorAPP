package com.example.contadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getCanonicalName();
    private static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Aplicação iniciada");

    }

    public void incrementa(View view) {

        //alterando o texto da Textviewer
        TextView mensagem = findViewById(R.id.Mensagem);
        count++;

        Integer i = new Integer(count);
        mensagem.setText(i.toString());

    }

    public void decrementa(View view) {

        //alterando o texto da Textviewer
        TextView mensagem = findViewById(R.id.Mensagem);
        count--;

        Integer i = new Integer(count);
        mensagem.setText(i.toString());

    }
    public void zerar(View view) {

        //alterando o texto da Textviewer
        TextView mensagem = findViewById(R.id.Mensagem);
        count=0;

        Integer i = new Integer(count);
        mensagem.setText(i.toString());

    }
}
