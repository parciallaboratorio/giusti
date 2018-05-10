package ar.edu.utn.fra.lab5.a1erparcial;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 03/10/2017.
 */

public class VistaControlador {
    //TODO: Traer del Main lo necesario para usar MVC
    public ImageView imgContacto;
    public TextView main_nombre;
    public TextView main_telefono;
    Activity activity;
    public Button btn_llamar;
    public RecyclerView rv;

    public VistaControlador(Activity activity) {
        this.activity = activity;

        imgContacto= (ImageView) this.activity.findViewById(R.id.vh_img);
        main_nombre = (TextView) this.activity.findViewById(R.id.main_nombre);
        main_telefono = (TextView) this.activity.findViewById(R.id.main_telefono);
        btn_llamar = (Button) this.activity.findViewById(R.id.btn_llamar);
        btn_llamar.setOnClickListener((MainActivity)this.activity);
        rv = (RecyclerView) this.activity.findViewById(R.id.rv1);
    }
}
