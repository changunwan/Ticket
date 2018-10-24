package com.example.asus.ticket;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.ticket.Promo.Promo;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Camera camera;
    Button btnPesan,btnFoto;
    TextView txtSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPesan = (Button) findViewById(R.id.btnPesan);
        btnFoto = (Button) findViewById(R.id.camera);

        txtSlogan = (TextView) findViewById(R.id.txtSlogan);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, Deteksi.class);
                startActivity(inte);
            }
        });
        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, Fragment.class);
                startActivity(inte);
            }
        });



    }
}
