package com.example.instagramclone.Profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagramclone.R;

/**
 * @author chrisyuhimself@gmail.com
 * @date 4/2/2023 13:41
 */
public class SignOutFragment extends Fragment {
    private static final String TAG = "SignOutFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_signout, container, false);
        return view;
    }
}
