package com.example.yessenia.exa_som_prac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class principal extends Activity {
    RadioGroup RgAcciones;
    Button btnCerrar, btnAccion;
    EditText edtResul;
    RadioButton rbTelefonica,rbArea;
    Intent intento, intento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnCerrar = (Button)findViewById(R.id.btnCerrar);
        rbTelefonica = (RadioButton)findViewById(R.id.rbTelefonica);
        rbArea = (RadioButton)findViewById(R.id.rbArea);
        btnAccion = (Button)findViewById(R.id.btnAccion);
        edtResul = (EditText)findViewById(R.id.edtResul);
        RgAcciones = (RadioGroup)findViewById(R.id.RgAcciones);
        intento = new Intent(this,llamada.class);
        intento2 = new Intent(this,Calculo.class);

        View.OnClickListener list = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String opcion = "";
                switch (v.getId()){
                    case R.id.rbTelefonica:
                        opcion = "LLAMADA TELEFONICA";
                        break;
                    case R.id.rbArea:
                        opcion = "CALCULAR AREA";
                        break;
                }
                edtResul.setText("Opcion Seleccionada :" + opcion);
            }
        };
        rbTelefonica.setOnClickListener(list);
        rbArea.setOnClickListener(list);

    }

    public void MiClick (View v)
    {
    if (rbTelefonica.isChecked()){
     startActivity(intento);
 }else if (rbArea.isChecked()){
        startActivity(intento2);
    }
    }




    public void Click (View v)
    {

        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
