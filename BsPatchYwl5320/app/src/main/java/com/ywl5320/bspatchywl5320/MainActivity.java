package com.ywl5320.bspatchywl5320;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onPatch(View view) {

        String oldfile = Environment.getExternalStorageDirectory().getAbsolutePath() + "/bspatch/app_old1.apk";
        String newfile = Environment.getExternalStorageDirectory().getAbsolutePath() + "/bspatch/app_new1.apk";
        String patchfile = Environment.getExternalStorageDirectory().getAbsolutePath() + "/bspatch/app_patch1.patch";

        int restlt = BsPatchYwl5320Util.getInstance().bsPatch(oldfile, newfile, patchfile);
        if(restlt == 0)
        {
            Log.d("ywl5320", "合并成功");
            Toast.makeText(this, "合并成功", Toast.LENGTH_LONG).show();
        }
        else
        {
            Log.d("ywl5320", "合并失败");
            Toast.makeText(this, "合并失败", Toast.LENGTH_LONG).show();
        }
    }
}
