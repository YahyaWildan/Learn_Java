package com.example.homefragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListenFragment extends Fragment {

    private WebView webView;

    public static ListenFragment getInstance(){
        ListenFragment listenFragment = new ListenFragment();
        return listenFragment;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listen,container, false);
        webView = view.findViewById(R.id.webview_youtube_listener);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://quran.kemenag.go.id/");
        return view;
    }
}
