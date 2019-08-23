package com.example.nightmare_album;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    VisualKey nightmare = new VisualKey("NIGHTMARE","YOMI","柩","咲人","Ni~ya","RUKA",5);

    Button button2011;
    Button button2013;
    Button button2014;
    Button button2015;

    private void pushCountDisplay(){
        nightmare.push();
        TextView push = (TextView)findViewById(R.id.push);
        push.setText("ボタンを押した回数："+nightmare.getPush()+"回");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2011 = (Button)findViewById(R.id.button_2011);
        button2013 = (Button)findViewById(R.id.button_2013);
        button2014 = (Button)findViewById(R.id.button_2014);
        button2015 = (Button)findViewById(R.id.button_2015);

        button2011.setOnClickListener(new View.OnClickListener() {
            TextView albumTitle = (TextView)findViewById(R.id.albumTitle);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);

            @Override
            public void onClick(View view) {
                albumTitle.setText("NIGHTMARE（2011年）");
                imageView.setImageResource(R.drawable.nightmare);

                pushCountDisplay();
            }
        });

        button2013.setOnClickListener(new View.OnClickListener() {
            TextView albumTitle = (TextView)findViewById(R.id.albumTitle);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);

            @Override
            public void onClick(View view) {
                albumTitle.setText("SCUMS（2013年）");
                imageView.setImageResource(R.drawable.scums);

                pushCountDisplay();
            }
        });

        button2014.setOnClickListener(new View.OnClickListener() {
            TextView albumTitle = (TextView)findViewById(R.id.albumTitle);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);

            @Override
            public void onClick(View view) {
                albumTitle.setText("TO BE OR NOT TO BE（2014年）");
                imageView.setImageResource(R.drawable.tobeornottobe);

                pushCountDisplay();
            }
        });

        button2015.setOnClickListener(new View.OnClickListener() {
            TextView albumTitle = (TextView)findViewById(R.id.albumTitle);
            ImageView imageView = (ImageView)findViewById(R.id.imageView);

            @Override
            public void onClick(View view) {
                albumTitle.setText("CARPE DIEM（2015年）");
                imageView.setImageResource(R.drawable.carpediem);

                pushCountDisplay();
            }
        });

        TextView introduce = (TextView)findViewById(R.id.introduce);
        introduce.setText(nightmare.getBandName()
                            +" 日本の"+nightmare.getInfo()+"バンド。");

        TextView introduce2 = (TextView)findViewById(R.id.introduce2);
        introduce2.setText(" Vocal."+nightmare.getVocal()
                +",Guitar."+nightmare.getGuitarRight()+",Guitar."+ nightmare.getGuitarLeft()
                +",Base."+nightmare.getBase()+",Drums."+nightmare.getDrums()+"。");
    }
}
