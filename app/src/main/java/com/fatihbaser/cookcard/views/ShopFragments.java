package com.fatihbaser.cookcard.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fatihbaser.cookcard.R;
import com.fatihbaser.cookcard.databinding.FragmentShopFragmentsBinding;


public class ShopFragments extends Fragment {



   FragmentShopFragmentsBinding fragmentShopFragmentsBinding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        fragmentShopFragmentsBinding=FragmentShopFragmentsBinding.inflate(inflater,container,false);
        return fragmentShopFragmentsBinding.getRoot();
    }
}