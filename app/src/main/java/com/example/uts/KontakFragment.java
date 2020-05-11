package com.example.uts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
    Tanggal Pengerjaan : 10 Mei 2019
    NIM : 10117105
    Nama : Arvi Nazwan A
    Kelas : IF-3
    */

public class KontakFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);
        return view;
    }
}