package com.example.yessenia.exa_som_prac;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class llamada extends Activity {
    EditText edtTel,edtResult;
    Button btnLlamar,btnCerrar;
    Intent iMiIntento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);
        edtTel = (EditText)findViewById(R.id.edtTel);
        btnLlamar =(Button)findViewById(R.id.btnLlamar);
        btnCerrar =(Button)findViewById(R.id.btnCerrar);
        edtResult = (EditText)findViewById(R.id.edtResul);
    }



    public void miClick (View v){
    String sTel;
        sTel = edtTel.getText().toString();
        iMiIntento = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        startActivity(iMiIntento);
        String opcion = "";
            switch (v.getId()){
                case R.id.edtTel:
                    opcion = "";
                    break;
            }

            edtResult.setText("Opcion Seleccionada :" + opcion);
        }


    public void iClick (View v){
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_llamada, menu);
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

