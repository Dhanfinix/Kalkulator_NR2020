
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class InformasiProduk extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;
    private TextView tampilan9;
    private TextView tampilan10;
    private TextView tampilan11;
    private TextView btnLang;





    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_informasi_produk );

        tampilan1 = findViewById ( R.id.tvtampilan1 );
        tampilan2 = findViewById ( R.id.tvtampilan2 );
        tampilan3 = findViewById ( R.id.tvtampilan3 );
        tampilan4 = findViewById ( R.id.tvtampilan4 );
        tampilan5 = findViewById ( R.id.tvtampilan5 );
        tampilan6 = findViewById ( R.id.tvtampilan6 );
        tampilan7 = findViewById ( R.id.tvtampilan7 );
        tampilan8 = findViewById ( R.id.tvtampilan8 );
        tampilan9 = findViewById ( R.id.tvtampilan9 );
        tampilan10 = findViewById ( R.id.tvtampilan10 );
        tampilan11 = findViewById ( R.id.tvtampilan11 );
        btnLang = findViewById(R.id.btn_lang);

        btnLang.setOnClickListener(view -> {
            String selected = btnLang.getText().toString();
            if (selected.equals("ID")){
                tampilan1.setText(R.string.info_en);
                tampilan2.setText(R.string.info_en2);
                tampilan3.setText(R.string.info_en3);
                tampilan4.setText(R.string.keterangan_en);
                tampilan5.setText(R.string.info_en4);
                tampilan6.setText(R.string.info_en5);
                tampilan7.setText(R.string.info_en6);
                tampilan8.setText(R.string.info_en7);
                tampilan9.setText(R.string.info_en8);
                tampilan10.setText(R.string.info_en9);
                tampilan11.setText(R.string.info_en10);
                btnLang.setText(R.string.en);
            } else {
                tampilan1.setText(R.string.info_indo);
                tampilan2.setText(R.string.info_indo2);
                tampilan3.setText(R.string.info_indo3);
                tampilan4.setText(R.string.keterangan);
                tampilan5.setText(R.string.info_indo4);
                tampilan6.setText(R.string.info_indo5);
                tampilan7.setText(R.string.info_indo6);
                tampilan8.setText(R.string.info_indo7);
                tampilan9.setText(R.string.info_indo8);
                tampilan10.setText(R.string.info_indo9);
                tampilan11.setText(R.string.info_indo10);
                btnLang.setText(R.string.indo);
            }
        });

    }
}
