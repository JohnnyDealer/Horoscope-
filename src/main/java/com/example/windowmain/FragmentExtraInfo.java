package com.example.windowmain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


public class FragmentExtraInfo extends Fragment {
    View v;
    Switch aSwitch;
    TextView textView;
    ToggleButton toggleButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_extra_info, container, false);
        textView = v.findViewById(R.id.textViewExtraAdditional);
        textView.setVisibility(View.INVISIBLE);
        toggleButton = v.findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setVisibility(View.VISIBLE);
                }
                else{
                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });
        // Inflate the layout for this fragment
        return v;
    }


}
