package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bplus;
    Button bminus;
    Button bclr;
    Button bequal;
    TextView tv;

    double res=0;
    int schetm=0;
    int schetp=0;

    double[] recp= new double[100];
    double[] recm= new double[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        bequal=(Button) findViewById(R.id.bequal);
        bplus=(Button) findViewById(R.id.bplus);
        bminus=(Button) findViewById(R.id.bminus);
        bclr=(Button) findViewById(R.id.bclr);
        tv=(TextView) findViewById(R.id.tv);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bplus.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bclr.setOnClickListener(this);
        bequal.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        String tvs;
        switch (v.getId()){
            case R.id.b1 :
                res=(res*10)+1;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b2 :
                res=(res*10)+2;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b3 :
                res=(res*10)+3;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b4 :
                res=(res*10)+4;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b5 :
                res=(res*10)+5;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b6 :
                res=(res*10)+6;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b7 :
                res=(res*10)+7;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b8 :
                res=(res*10)+8;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b9 :
                res=(res*10)+9;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.b0 :
                res=res*10;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

                case R.id.bplus :
                recp[schetp]=res;
                schetp++;
                res=0;
                break;

            case R.id.bminus:
                recm[schetm]=-res;
                schetm++;
                res=0;
                break;

            case R.id.bclr :

                for(int i = 0; i<schetm;i++){
                    recm[i]=0;
                }
                schetm=0;
                for(int i = 0; i<schetp;i++){
                    recp[i]=0;
                }
                schetp=0;
                res=0;
                tvs= String.valueOf(res);
                tv.setText(tvs);
                break;

            case R.id.bequal :
                //вывод плюсовой
                for(int i = 0; i<schetp;i++){
                    res+=recp[i];
                }
                //Минусовой
                for(int i = 0; i<schetm;i++){
                    res+=recm[i];
                    res=-res;
                }
                tvs= String.valueOf(res);
                tv.setText(tvs);
                //Обнуляю счётчики
                //Обнуление счётчика +
                for(int i = 0; i<schetp;i++){
                    recp[i]=0;
                }
                schetp=0;
                //обнуления счётчика -
                for(int i = 0; i<schetm;i++){
                    recm[i]=0;
                }
                schetm=0;
                break;
        }
    }
}
