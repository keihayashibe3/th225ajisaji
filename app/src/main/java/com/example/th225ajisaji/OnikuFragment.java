package com.example.th225ajisaji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.th225ajisaji.databinding.FragmentOnikuBinding;
import com.example.th225ajisaji.databinding.FragmentSerachBinding;

public class OnikuFragment extends Fragment {

    // OnikuのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_oniku,
                container, false);
    }




}