package com.paunoski.manuel.databinding_two_way;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class MyObservableObject extends BaseObservable{
    private String field;

    @Bindable
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
        notifyPropertyChanged(BR.field);
    }
}