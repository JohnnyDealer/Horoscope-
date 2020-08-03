package com.example.windowmain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


public class FragmentAdditionalInfo extends Fragment {

    View v;
    Switch aSwitch;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_additional_info, container, false);
        aSwitch = (Switch) v.findViewById(R.id.switchText);
        textView = (TextView) v.findViewById(R.id.textViewAdditional);
        textView.setVisibility(View.INVISIBLE);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
        return v;
    }




}
