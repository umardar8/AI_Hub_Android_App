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
import com.howtosuperai.superai.databinding.FragmentProductivityBinding;

public class ProductivityFragment extends Fragment {

    FragmentProductivityBinding binding;
    LinearLayout simplified, ocoya, seogpt, polarr, runway, sheetplus, krisp;
    String[] urls = new String[7];

    public ProductivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProductivityBinding.inflate(inflater, container, false);

        simplified = binding.simplified;
        ocoya = binding.ocoya;
        seogpt = binding.seogpt;
        polarr = binding.polarr;
        runway = binding.runway;
        sheetplus = binding.sheetplus;
        krisp = binding.krisp;

        urls[0] = "https://simplified.com/";
        urls[1] = "https://ocoya.com/";
        urls[2] = "https://seovendor.co/seo-gpt/";
        urls[3] = "https://copilot.polarr.com/polarr-photo-editing-ai-copilot";
        urls[4] = "https://app.runwayml.com/";
        urls[5] = "https://sheetplus.ai/";
        urls[6] = "https://account.krisp.ai/";

        simplified.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[0]);
            startActivity(intent);
        });

        ocoya.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[1]);
            startActivity(intent);
        });

        seogpt.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[2]);
            startActivity(intent);
        });

        polarr.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[3]);
            startActivity(intent);
        });

        runway.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[4]);
            startActivity(intent);
        });

        sheetplus.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[5]);
            startActivity(intent);
        });

        krisp.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[6]);
            startActivity(intent);
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}