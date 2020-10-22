package co.edu.unimagdalena.apmoviles.tallertabletlistview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import co.edu.unimagdalena.apmoviles.tallertabletlistview.Model.LibrosModel;
import co.edu.unimagdalena.apmoviles.tallertabletlistview.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<LibrosModel> librosModels;

    public CustomAdapter(Context context, List<LibrosModel> librosModels) {
        this.context = context;
        this.librosModels = librosModels;
    }

    @Override
    public int getCount() {
        return librosModels.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView txtLibro;
        TextView txtEdicion;
        TextView txtAutor;

        LibrosModel librosModel = librosModels.get(i);
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.layout_lista_libros, null);

        txtAutor = view.findViewById(R.id.txtAutor);
        txtLibro = view.findViewById(R.id.txtLibro);
        txtEdicion = view.findViewById(R.id.txtEdicion);

        txtAutor.setText(librosModel.autor);
        txtLibro.setText(librosModel.libro);
        txtEdicion.setText(librosModel.edicicion);

        return view;
    }
}
