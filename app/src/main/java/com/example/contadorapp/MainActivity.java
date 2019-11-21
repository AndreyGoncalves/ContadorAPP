package com.example.contadorapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getCanonicalName();
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Aplicação iniciada");
        this.count = 0;

        if(savedInstanceState != null){
            this.count = savedInstanceState.getInt("count");
            TextView mensagem = findViewById(R.id.Mensagem);
            mensagem.setText((""+this.count));
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "Started");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "Stopped");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "Paused");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "Resumed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "Destroyed");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", this.count);
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
