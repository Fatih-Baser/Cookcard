package com.fatihbaser.cookcard.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.fatihbaser.cookcard.models.CardItem;
import com.fatihbaser.cookcard.models.Product;

import java.util.ArrayList;
import java.util.List;

public class CardRepo {

    private MutableLiveData<List<CardItem>> mutableLiveData=new MutableLiveData<>();

    public LiveData<List<CardItem>> getCard(){
        if(mutableLiveData.getValue()==null ){
            initCard();

        }
        return mutableLiveData;
    }
    public void initCard(){
        mutableLiveData.setValue(new ArrayList<CardItem>());
    }

    public boolean addItemCard(Product product){
        if(mutableLiveData.getValue()==null){
            initCard();
        }
        List <CardItem> cardItemList=new ArrayList<>(mutableLiveData.getValue());
        CardItem cardItem=new CardItem(product,1);
        cardItemList.add(cardItem);
        mutableLiveData.setValue(cardItemList);
        return true;
    }
}
