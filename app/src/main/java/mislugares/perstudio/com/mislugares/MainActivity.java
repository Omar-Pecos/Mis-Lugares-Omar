package mislugares.perstudio.com.mislugares;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public AdaptadorLugares adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptador = new AdaptadorLugares(this);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.acercaDe){
            lanzarAcercaDe(null);
            return true;
        }
        if(id == R.id.menu_buscar){
            lanzarVistaLugar(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void lanzarAcercaDe(View view){
        Intent i = new Intent(this,AcercaDe.class);
        startActivity(i);
    }
    private void lanzarVistaLugar(View view){

        final EditText entrada = new EditText(this);
        entrada.setText("0");

        new AlertDialog.Builder(this)
                .setTitle("Seleccion de lugar")
                .setMessage("Indique su id")
                .setView(entrada)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int whichButton) {
                        long id = Long.parseLong(entrada.getText().toString());
                        Intent i = new Intent(MainActivity.this,VistaLugar.class);
                        i.putExtra("id", id);
                        startActivity(i);
                    }
                })
                .setNegativeButton("Cancel",null)
                .show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View vista, int posicion, long id) {
        Intent i = new Intent(this, VistaLugar.class);
        i.putExtra("id",id);
        startActivity(i);
    }
}
