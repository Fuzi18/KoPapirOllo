package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.rock);
                int geptipp=rnd.nextInt(3);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.paper);
                int geptipp=rnd.nextInt(3);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ko.setImageResource(R.drawable.scissors);
                int geptipp=rnd.nextInt(3);
                if (geptipp==0){
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                } else if(geptipp==1){
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Te nyertél", Toast.LENGTH_SHORT).show();
                }
                else{
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Döntetlen lett", Toast.LENGTH_SHORT).show();
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

    }
}