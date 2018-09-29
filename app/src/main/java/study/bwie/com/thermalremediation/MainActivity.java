package study.bwie.com.thermalremediation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 报错
     * @param view
     */
    public void onError(View view) {
        Log.d(TAG, "onError: "+1/0);
    }

    /**
     * 修复漏洞
     * @param view
     */
    public void repair(View view) {
        //return 'git rev-parse --short HEAD'.execute().text.trim();
    }
}
