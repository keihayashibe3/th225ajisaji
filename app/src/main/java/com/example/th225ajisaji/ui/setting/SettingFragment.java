package com.example.th225ajisaji.ui.setting;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.th225ajisaji.MainActivity;
import com.example.th225ajisaji.R;
import com.example.th225ajisaji.databinding.FlagmentSettingBinding;


public class SettingFragment extends Fragment {


    private FlagmentSettingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SettingViewModel dashboardViewModel =
                new ViewModelProvider(this).get(SettingViewModel.class);

        binding = FlagmentSettingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSetting;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public void onStart() {
        super.onStart();

        Button button = (Button)getActivity().findViewById(R.id.buttonSetuzoku);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("接続完了画面");
                builder.setMessage("チンジャオロースの味をカスタマイズしました");
                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });

    }
}