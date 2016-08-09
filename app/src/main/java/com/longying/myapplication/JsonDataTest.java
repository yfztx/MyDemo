package com.longying.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 * json数据的保存及上传
 */
public class JsonDataTest extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "JsonDataTest";
    private String name;
    private int eag;
    private String sex;
    private Button mAppStart;
    private Button mAppStop;
    private Button mADStart;
    private Button mADStop;
    private Button mPStart;
    private Button mPStop;
    private Button mShow;

    private TextView mContent;
    private AppManager mApp;
    private List<BaseBean> list;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_test);

        initData();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        list = new ArrayList<BaseBean>();
        mApp = new AppManager(getApplicationContext());
        mAppStart = (Button) findViewById(R.id.but_start);
        mAppStop = (Button) findViewById(R.id.but_stop);
        mADStart = (Button) findViewById(R.id.ad_start);
        mADStop = (Button) findViewById(R.id.ad_stop);
        mPStart = (Button) findViewById(R.id.p_start);
        mPStop = (Button) findViewById(R.id.p_stop);
        mShow = (Button) findViewById(R.id.but_show);
        mContent = (TextView) findViewById(R.id.tv_content);

        mAppStart.setOnClickListener(this);
        mAppStop.setOnClickListener(this);
        mADStart.setOnClickListener(this);
        mADStop.setOnClickListener(this);
        mPStart.setOnClickListener(this);
        mPStop.setOnClickListener(this);
        mShow.setOnClickListener(this);
    }


    public void saveData(){
        for (int i=0; i<10; i++){}
        Log.i(TAG,"");
    }

    /**
     * 点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.but_start: //应用开启

                UserDataBean userDataBean = new UserDataBean();
                userDataBean.action = "APP_START";
                userDataBean.time = System.currentTimeMillis();
                UserDataBean.ParamBean paramBean = new UserDataBean.ParamBean();
                paramBean.BRAND = "品牌（酷派）";
                userDataBean.param = paramBean;
                String astring = mApp.readFileSdcard(mApp.FILE_NAME);
                if (" ".equals(astring)){
                    list.add(userDataBean);
                }else {
                    list = mApp.getJsonString(astring);
                    list.add(userDataBean);
                }
                String saveString = mApp.setJsonString(list);
                mApp.writeFileSdcard(saveString);

                Toast.makeText(this,"添加成功",Toast.LENGTH_SHORT) .show();
            case R.id.but_stop:
                Toast.makeText(this,"写入一条数据",Toast.LENGTH_SHORT) .show();
                UserDataBean bean = new UserDataBean();
                bean.action = "APP_STOP";
                bean.time = System.currentTimeMillis();
                break;
            case R.id.ad_start:
                break;
            case R.id.ad_stop:
                break;
            case R.id.p_start:
                break;
            case R.id.p_stop:
                break;
            case R.id.but_show:
                break;
            default:
                break;
        }
    }
}
