package com.longying.myapplication;

import android.content.Context;
import android.os.Environment;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/9.
 * 工具类
 */
public class AppManager {
    public static final String FILE_NAME ="appLog.txt";
    private  Context context;
    private Gson gson;

    public AppManager(Context context){
        this.context = context;
        gson = new Gson();
    }
    /**
     * 写入数据
     *
     * @param writestr 文件内容
     */
   public void writeFile( String writestr){
       try {

           FileOutputStream fout = context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
           byte[] bytes = writestr.getBytes();
           fout.write(bytes);
           fout.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    /**
     * 读取数据
     * @param fileName 要读取的文件名
     * @return 返回结果
     */
    public String readFile(String fileName){
        String res = "";
        try {
            FileInputStream fin = context.openFileInput(fileName);
            int length = fin.available();
            byte [] buffer = new byte[length];
            fin.read(buffer);
            res = new String(buffer);
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 保存到内存卡
     * @param message 需要保存的内容
     */
    public void writeFileSdcard(String message){
        if ("[]".equals(message)){
            message = "";
        }
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
                File directory = Environment.getExternalStorageDirectory();
                File file = new File(directory, FILE_NAME);
                if ( !file.exists()){
                    file.createNewFile();
                }
                FileOutputStream fout = new FileOutputStream(file);
                byte[] bytes = message.getBytes();
                fout.write(bytes);
                fout.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取数据
     * @param fileName
     * @return
     */
    public String readFileSdcard(String fileName){
        String res = "";
        try {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
                File dir = Environment.getExternalStorageDirectory();
                File file = new File(dir, fileName);
                FileInputStream fis = new FileInputStream(file);
                if (!file.exists()){
                    return new String(" ");
                }
                int length = fis.available();
                byte[] bytes = new byte[length];
                fis.read(bytes);
                res = new String(bytes);
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ("".equals(res)){
            res = " ";
        }

        return res;
    }

    /**
     * 删除数据
     */
    public void deletheAll(){
        writeFileSdcard("");
    }

    /**
     *
     * @param agoodsdatas
     * @return
     */
    public  String setJsonString(List<BaseBean> agoodsdatas){
        String str = gson.toJson(agoodsdatas);
        return str;
    }

    /**
     * 解析
     * @param str
     * @return
     */
    public List<BaseBean> getJsonString(String str){
        List bb = gson.fromJson(str, new TypeToken<List<BaseBean>>(){}.getType() );
        return bb;
    }

}
