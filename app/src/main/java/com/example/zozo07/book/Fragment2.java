package com.example.zozo07.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Zozo07 on 2016.04.17..
 */
public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Fragment 2", "onCreateView");
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        //Button view
        //getActivity kell mert Fragmenten belül vagyunk
        Button btnGetText = (Button) getActivity().findViewById(R.id.btnGetText);


        btnGetText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView lbl = (TextView) getActivity().findViewById(R.id.lblFragment1);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment 2", "onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment 2", "onDestroyView");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment 2", "onResume");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment 2", "onDestroy");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment 2", "onCreate");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment 2", "onPause");
    }
}








