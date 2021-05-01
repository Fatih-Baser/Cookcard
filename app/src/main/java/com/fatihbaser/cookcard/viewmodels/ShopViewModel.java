package com.fatihbaser.cookcard.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fatihbaser.cookcard.models.CardItem;
import com.fatihbaser.cookcard.models.Product;
import com.fatihbaser.cookcard.repositories.CardRepo;
import com.fatihbaser.cookcard.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {
    ShopRepo shopRepo=new ShopRepo();
    CardRepo cartRepo = new CardRepo();
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
    public LiveData<List<CardItem>> getCart() {
        return cartRepo.getCard();
    }
    public boolean addItemToCard(Product product) {
        return cartRepo.addItemCard(product);
    }



}
