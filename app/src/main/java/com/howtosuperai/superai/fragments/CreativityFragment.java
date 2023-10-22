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
import com.howtosuperai.superai.databinding.FragmentCreativityBinding;

public class CreativityFragment extends Fragment {

    FragmentCreativityBinding binding;
    LinearLayout looka, polarr, lumen5, spiritme, runway, invideo, murf, speechify, krisp;
    String[] urls = new String[9];

    public CreativityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreativityBinding.inflate(inflater, container, false);

        urls[0] = "https://looka.com/";
        urls[1] = "https://copilot.polarr.com/polarr-photo-editing-ai-copilot";
        urls[2] = "https://lumen5.com/dashboard/";
        urls[3] = "https://studio.spiritme.tech/";
        urls[4] = "https://app.runwayml.com/";
        urls[5] = "https://invideo.io/dashboard";
        urls[6] = "https://murf.ai/studio/";
        urls[7] = "https://voiceover.speechify.com/";
        urls[8] = "https://account.krisp.ai/";

        looka = binding.looka;
        polarr = binding.polarr;
        lumen5 = binding.lumen5;
        spiritme = binding.spiritme;
        runway = binding.runway;
        invideo = binding.invideo;
        murf = binding.murf;
        speechify = binding.speechify;
        krisp = binding.krisp;

        looka.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[0]);
            startActivity(intent);
        });

        polarr.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[1]);
            startActivity(intent);
        });

        lumen5.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[2]);
            startActivity(intent);
        });

        spiritme.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[3]);
            startActivity(intent);
        });

        runway.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[4]);
            startActivity(intent);
        });

        invideo.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[5]);
            startActivity(intent);
        });

        murf.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[6]);
            startActivity(intent);
        });

        speechify.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[7]);
            startActivity(intent);
        });

        krisp.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[8]);
            startActivity(intent);
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}