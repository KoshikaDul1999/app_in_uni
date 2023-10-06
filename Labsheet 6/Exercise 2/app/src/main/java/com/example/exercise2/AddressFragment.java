package com.example.exercise2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AddressFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_address, container, false);

        String address = "Sri dharmaloka mawathe, Ingiriya";
        TextView textView = view.findViewById(R.id.textViewAddresss);
        textView.setText(address);

        return view;
    }
}
