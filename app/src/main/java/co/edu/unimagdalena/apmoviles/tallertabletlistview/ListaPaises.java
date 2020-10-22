package co.edu.unimagdalena.apmoviles.tallertabletlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import co.edu.unimagdalena.apmoviles.tallertabletlistview.Adapter.CustomAdapter;
import co.edu.unimagdalena.apmoviles.tallertabletlistview.Model.LibrosModel;

public class ListaPaises extends AppCompatActivity {

    ListView listapaises;
    List<LibrosModel> librosModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);

        listapaises = findViewById(R.id.lstpaises);
        CustomAdapter adapter = new CustomAdapter(this, GetData());
        listapaises.setAdapter(adapter);

        listapaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LibrosModel librosModel = librosModelList.get(position);
                Toast.makeText(getApplicationContext(), "Libro : " + (librosModel.autor),Toast.LENGTH_LONG).show();
            }
        });

    }

    private List<LibrosModel> GetData() {
        librosModelList = new ArrayList<>();
        librosModelList.add(new LibrosModel("El corazón de la piedra"," José María García López","Nocturna"));
        librosModelList.add(new LibrosModel("Salmos de vísperas","Esteban Hernández Castelló","Obra social de Caja de Avila"));
        librosModelList.add(new LibrosModel("La música en las catedrales españolas del Siglo de Oro"," Robert Stevenson","Alianza Música"));
        librosModelList.add(new LibrosModel("Tomás Luis de Victoria: A guide to research","Eugene Casjen Cramer","Garland Publishing Inc."));
        librosModelList.add(new LibrosModel("Studies in the Music of Tomás Luis de Victoria","Eugene Casjen Cramer","Ashgate"));
        librosModelList.add(new LibrosModel("La polifonía clásica","Samuel Rubio","Biblioteca \"la ciudad de Dios\", Real Monasterio de El Escorial"));

        return librosModelList;
    }


}
