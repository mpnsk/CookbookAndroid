package com.paunoski.manuel.databinding_two_way;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.paunoski.manuel.databinding_two_way.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MyObservableObject myObservableObject = new MyObservableObject();
        myObservableObject.setField("my observable object");
        binding.setMyData(myObservableObject);

        MyObjectWithObservableFields anotherObject = new MyObjectWithObservableFields();
        anotherObject.field.set("another object");
        binding.setAnotherObject(anotherObject);

        binding.editText.setText("this doesn't work any more");
    }
}
