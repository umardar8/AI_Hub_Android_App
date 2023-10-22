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
import com.howtosuperai.superai.databinding.FragmentPopularBinding;

public class PopularFragment extends Fragment {

    FragmentPopularBinding binding;
    LinearLayout chatgpt, bard, bingai, dalle2, jasper;
    String[] urls = new String[5];

    public PopularFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPopularBinding.inflate(inflater, container, false);

        urls[0] = "https://chat.openai.com";
        urls[1] = "https://bard.google.com/";
        urls[2] = "https://bingapp.microsoft.com/";
        urls[3] = "https://jasper.ai";
        urls[4] = "https://labs.openai.com/";

        chatgpt = binding.chatgpt;
        bard = binding.bard;
        bingai = binding.bingai;
        dalle2 = binding.dalle2;
        jasper = binding.jasper;

        chatgpt.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[0]);
            startActivity(intent);
        });

        bard.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[1]);
            startActivity(intent);
        });

        bingai.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[2]);
            startActivity(intent);
        });

        jasper.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[3]);
            startActivity(intent);
        });

        dalle2.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            intent.putExtra("links", urls[4]);
            startActivity(intent);
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}