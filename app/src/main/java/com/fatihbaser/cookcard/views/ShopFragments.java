package com.fatihbaser.cookcard.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fatihbaser.cookcard.R;
import com.fatihbaser.cookcard.adapters.ShopListAdapter;
import com.fatihbaser.cookcard.databinding.FragmentShopFragmentsBinding;
import com.fatihbaser.cookcard.models.Product;
import com.fatihbaser.cookcard.viewmodels.ShopViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;


public class ShopFragments extends Fragment implements ShopListAdapter.ShopInterface {

    private static final String TAG = "ShopFragment";

    private ShopListAdapter shopListAdapter;
    private ShopViewModel shopViewModel;
    private NavController navController;

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        shopListAdapter = new ShopListAdapter(this);
        fragmentShopFragmentsBinding.shopRecyclerView.setAdapter(shopListAdapter);

        //bu resimler arasi cizgi yapiyor
        fragmentShopFragmentsBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        fragmentShopFragmentsBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL));

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getproducts().observe(getViewLifecycleOwner(), new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                shopListAdapter.submitList(products);
            }
        });

        navController = Navigation.findNavController(view);

    }

    @Override
    public void addItem(Product product) {

    }

    @Override
    public void onItemClick(Product product) {
        shopViewModel.setProduct(product);
        navController.navigate(R.id.action_shopFragments_to_projectDetailFragment);
        }
    }
