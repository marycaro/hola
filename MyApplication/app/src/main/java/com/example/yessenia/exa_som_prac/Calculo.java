package com.example.yessenia.exa_som_prac;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculo extends Activity {
    EditText edtPi,edtRadio;
    Button btnCerrar;
   Double area,volumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        edtPi = (EditText)findViewById(R.id.edtPi);
        edtRadio = (EditText)findViewById(R.id.edtRadio);
        btnCerrar = (Button)findViewById(R.id.btnCerrar);
    }

    public void Calcular (View v){
        area = Double.parseDouble(edtPi.getText().toString());
        volumen = Double.parseDouble(edtRadio.getText().toString());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
