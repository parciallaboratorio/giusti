package ar.edu.utn.fra.lab5.a1erparcial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 03/10/2017.
 */

public class ViewHolder  extends RecyclerView.ViewHolder implements  View.OnClickListener{

    public TextView nombre;
    public TextView apellido;
    public TextView telefono;
    public ImageView img;
    ItemClickListener listener;
    private Integer posicion;

    public ViewHolder(View itemView, ItemClickListener listener) {
        super(itemView);
        //TODO: Completar lo que falta acceder a los elementos view y setear el listener
        this.nombre = (TextView) itemView.findViewById(R.id.vh_nombre);
        this.apellido = (TextView) itemView.findViewById(R.id.vh_apellido);
        this.telefono = (TextView) itemView.findViewById(R.id.vh_telefono);
        this.img = (ImageView) itemView.findViewById(R.id.vh_img);
        this.listener = listener;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    @Override
    public void onClick(View v) {
        this.listener.onItemClick(v,this.posicion);
    }
}
