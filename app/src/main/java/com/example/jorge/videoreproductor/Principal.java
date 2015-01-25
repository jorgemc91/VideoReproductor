package com.example.jorge.videoreproductor;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class Principal extends Activity {
    private VideoView vv;
    private Uri urlArchivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        vv = (VideoView)findViewById(R.id.videoView);
        urlArchivo = getIntent().getData();
        reproducir(urlArchivo);
    }

    public void reproducir(Uri ruta) {
        vv.setVideoURI(ruta);
        vv.setMediaController(new MediaController(this));
        vv.start();
    }
}
