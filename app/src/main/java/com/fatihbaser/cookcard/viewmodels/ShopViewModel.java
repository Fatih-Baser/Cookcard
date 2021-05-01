package com.fatihbaser.cookcard.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fatihbaser.cookcard.models.Product;
import com.fatihbaser.cookcard.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {
    ShopRepo shopRepo=new ShopRepo();
    MutableLiveData<Product>mutableLiveData=new MutableLiveData<>();
    public LiveData<List<Product>> getproducts(){


        return shopRepo.getProducts();

    }
    public void setProduct(Product product){
        mutableLiveData.setValue(product);
    }
    public LiveData<Product> getProduct() {
        return mutableLiveData;
    }



}
