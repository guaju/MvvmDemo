package com.guaju.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.guaju.mvvmdemo.databinding.ActivityMainBinding;
import com.guaju.mvvmdemo.model.Goods;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main);


        Goods goods = new Goods("iphone8",2888.88f,"会爆炸");
        amb.setGoods(goods);
        amb.setMa(this);
    }

    public void click(View v){
        Goods goods = new Goods("iphone8",((float)(Math.random()*100.0f)),"会爆炸");
        amb.setGoods(goods);
    }
}
