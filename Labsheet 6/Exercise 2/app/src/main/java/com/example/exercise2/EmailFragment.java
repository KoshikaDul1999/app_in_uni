package com.example.exercise2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EmailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_email, container, false);

        String email = "koshikadulanjana95@gmail.com";
        TextView textView = view.findViewById(R.id.textViewEmail);
        textView.setText(email);

        return view;
    }
}
