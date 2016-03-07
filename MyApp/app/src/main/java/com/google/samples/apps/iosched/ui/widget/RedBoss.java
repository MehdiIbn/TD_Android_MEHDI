package com.google.samples.apps.iosched.ui.widget;


/**
 * Created by MEHDI on 23/02/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mehdi.myapp.R;

public class RedBoss extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.jboss_tab,container,false);
        return v;
    }
}

