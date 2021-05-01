package com.fatihbaser.cookcard.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fatihbaser.cookcard.R;
import com.fatihbaser.cookcard.databinding.FragmentProjectDetailBinding;
import com.fatihbaser.cookcard.databinding.FragmentShopFragmentsBinding;
import com.fatihbaser.cookcard.viewmodels.ShopViewModel;


public class ProjectDetailFragment extends Fragment {



    FragmentProjectDetailBinding fragmentProjectDetailBinding;

    ShopViewModel shopViewModel;

//    public ProductDetailFragment() {
//        // Required empty public constructor
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProjectDetailBinding = FragmentProjectDetailBinding.inflate(inflater, container, false);
        return fragmentProjectDetailBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        fragmentProjectDetailBinding.setShopViewModel(shopViewModel);
    }
}