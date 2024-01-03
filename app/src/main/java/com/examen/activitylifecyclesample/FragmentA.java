package com.examen.activitylifecyclesample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.examen.activitylifecyclesample.databinding.FragmentABinding;


public class FragmentA extends Fragment {
    private FragmentABinding fragmentABinding;
    public static final String TAG = FragmentA.class.getSimpleName();
    private TextView txtView;
    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: is called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: is called" );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentABinding = FragmentABinding.inflate(inflater,container,false);
        initView();
        return fragmentABinding.getRoot();
      /*  View view = inflater.inflate(R.layout.fragment_a, container, false);
        Log.d(TAG, "onCreateView: is called");

        return view;*/
    }

    private void initView() {
        fragmentABinding.txtview.setText(R.string.fragmentA);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: is called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: is called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: is called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: is called");
    }
}