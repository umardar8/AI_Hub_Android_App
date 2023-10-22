package com.howtosuperai.superai.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.howtosuperai.superai.WebViewActivity;
import com.howtosuperai.superai.databinding.FragmentAcademicBinding;

public class AcademicFragment extends Fragment {

    FragmentAcademicBinding binding;
    LinearLayout jenni, paperpal, caktus, scholarcy, chatpdf, sheetplus;
    String[] urls = new String[6];

    public AcademicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAcademicBinding.inflate(inflater, container, false);

        urls[0] = "https://jenni.ai/";
        urls[1] = "https://paperpal.com/";
        urls[2] = "https://caktus.ai/";
        urls[3] = "https://scholarcy.com/";
        urls[4] = "https://chatpdf.com/";
        urls[5] = "https://sheetplus.ai/";

        jenni = binding.jenni;
        paperpal = binding.paperpal;
        caktus = binding.caktus;
        scholarcy = binding.scholarcy;
        chatpdf = binding.chatpdf;
        sheetplus = binding.sheetplus;

        jenni.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[0]);
            startActivity(intent);
        });

        paperpal.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[1]);
            startActivity(intent);
        });

        caktus.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[2]);
            startActivity(intent);
        });

        scholarcy.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[3]);
            startActivity(intent);
        });

        chatpdf.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[4]);
            startActivity(intent);
        });

        sheetplus.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[5]);
            startActivity(intent);
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}