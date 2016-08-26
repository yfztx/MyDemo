package com.longying.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getName();
    private Button mButton;
    private Button mButton2;
    private TextView mTextView;
    private TextView mTextView2;
    private TextView mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

         mButton.setOnClickListener(this);
         mButton2.setOnClickListener(this);
        mTextView2.setOnClickListener(this);
    }

    /**
     *
     */
    private void demoData() {
       if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){ //判断sd卡是否可用

           String dir = Environment.getExternalStorageDirectory().getAbsolutePath();//获取外部存储路径
           String path = dir +"/longying";
           File file = new File(path);
           mTextView.setText("file ="+ file.getName() + " ; path="+file.getPath());
          // File mfile = new File(file,"wd.txt");
           if (!file.exists()) {
               boolean mkdirs = file.mkdirs();
               Log.i("MainActivity", "demoData = = " + mkdirs);
			   
			   
			   
           }
       }
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.but_1);
        mButton2 = (Button) findViewById(R.id.but_2);
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mModel = (TextView) findViewById(R.id.tv_model) ;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.but_1:
                demoData();
                //showData();
                //contNuma();
                break;
            case R.id.but_2:
                mTextView.setText("");
                break;
            case R.id.textView2:
                startActivity(new Intent(getApplication(),JsonDataTest.class));

                break;
            case R.id.tv_model:

                break;
        }
    }

    /**
     *  1 3  5  7  9  11  13   15
     *  [] + [] + [] = 30;
     */
    private void contNuma() {
        int sum =0;
        int [] numa = {1,3,5,7,9,11,13,15,17,19};
        for (int i=0; i< numa.length; i++){
            for (int j=0; j< numa.length; j++){
                for (int n =0; n< numa.length; n++){
                    sum = numa[i] + numa[j] + numa[n];
                    Log.i(TAG,"sum =" +numa[i] + " " + numa[j] + " " + numa[ n] +" ");
                    if (sum ==30){
                        Log.i(TAG,"sum =======" +numa[i] + " " + numa[j] + " " + numa[ n] +" ");

                    }
                }
            }
        }
    }

    private void showData() {
        File sd=Environment.getExternalStorageDirectory();
        String path=sd.getPath()+"/notes";
        File file=new File(path);
        if(!file.exists()){
            boolean mkdirs = file.mkdirs();
            Log.i("TAG","showData  mkdirs="+mkdirs);

        }
    }
}
