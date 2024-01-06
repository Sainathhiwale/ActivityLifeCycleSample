package com.examen.activitylifecyclesample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.examen.activitylifecyclesample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //get the launch mode of the activity

       // binding.mainContainer.getId();
        initView();

    }

    private void initView() {
       // binding.etText.setText(R.string.helloActivity);
        int launchMode = getLaunchMode();
        // Print or log the launch mode
        //  System.out.println("Launch Mode: " + getLaunchModeString(launchMode));
        String result = getLaunchModeString(launchMode);
        Log.d(TAG, "onCreate: " + result);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    private int getLaunchMode() {
        try {
          return getPackageManager().getActivityInfo(getComponentName(),0).launchMode;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    private String getLaunchModeString(int launchMode) {
        switch (launchMode) {
            case ActivityInfo.LAUNCH_MULTIPLE:
                callHome();
                return "Standard";
            case ActivityInfo.LAUNCH_SINGLE_TOP:
                return "SingleTop";
            case ActivityInfo.LAUNCH_SINGLE_TASK:
                return "SingleTask";
            case ActivityInfo.LAUNCH_SINGLE_INSTANCE:
                return "SingleInstance";
            default:
                return "Unknown";
        }
    }

    private void callHome() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                FragmentA homeFragment = new FragmentA();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.main_container,homeFragment);
                fragmentTransaction.addToBackStack(null); // after added this activity does not close and app also stay as blank screens
                fragmentTransaction.commit();
            }
        },2000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }


}