package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ko;
    private TextView eredmeny;
    private ImageView gep;
    private Button btn_ko;
    private Button btn_papir;
    private Button btn_ollo;
    private Random rnd;
    private int emberEredmeny;
    private int gepEredmeny;
    private AlertDialog.Builder builderVege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.rock);
                int geptipp=rnd.nextInt(2);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    gepEredmeny++;
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                    emberEredmeny++;
                }
                if (emberEredmeny==3){
                    builderVege.setTitle("Győzelem");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();
                }else if(gepEredmeny==3){
                    builderVege.setTitle("Vereség");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();


                }
            }
        });

        btn_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.paper);
                int geptipp=rnd.nextInt(2);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                    gepEredmeny++;
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    emberEredmeny++;
                }
                if (emberEredmeny==3){
                    builderVege.setTitle("Győzelem");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();
                }else if(gepEredmeny==3){
                    builderVege.setTitle("Vereség");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();


                }
            }
        });

        btn_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.scissors);
                int geptipp=rnd.nextInt(2);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                    gepEredmeny++;
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                    emberEredmeny++;
                }
                if (emberEredmeny==3){
                    builderVege.setTitle("Győzelem");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();
                }else if(gepEredmeny==3){
                    builderVege.setTitle("Vereség");
                    AlertDialog dialog = builderVege.create();
                    dialog.show();


                }
            }
        });

    }
    public void init(){
        this.ko=findViewById(R.id.ko);
        this.gep=findViewById(R.id.gep);
        this.eredmeny=findViewById(R.id.eredmeny);
        this.btn_ko=findViewById(R.id.btn_ko);
        this.btn_papir=findViewById(R.id.btn_papir);
        this.btn_ollo=findViewById(R.id.btn_ollo);
        rnd=new Random();
        emberEredmeny=0;
        gepEredmeny=0;
        builderVege = new AlertDialog.Builder(MainActivity.this);
        builderVege.setCancelable(false).setMessage("Szeretne új játékot játszani?")
                .setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ujJatek();
                    }
                })
                .setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

    }
    private void ujJatek() {
        emberEredmeny=0;
        gepEredmeny=0;
        ko.setImageResource(R.drawable.rock);
        gep.setImageResource(R.drawable.rock);
    }
}