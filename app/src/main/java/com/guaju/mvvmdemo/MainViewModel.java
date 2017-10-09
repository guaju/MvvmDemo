package com.guaju.mvvmdemo;

import android.app.Activity;
import android.view.View;

import com.guaju.mvvmdemo.databinding.ActivityMainBinding;
import com.guaju.mvvmdemo.model.Goods;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by guaju on 2017/10/9.
 */

public class MainViewModel {
    ActivityMainBinding amb;

    public MainViewModel(Activity act,ActivityMainBinding amb) {
        this.amb=amb;
        setGoods();
        setList();
        setMap();
        setString();
        setMaaa();


    }
    public  void setMaaa(){
        amb.setMaaa(this);
    }
    //在本类中设置数据源
    public  void setGoods(){
        Goods goods = new Goods("iphone8",2888.88f,"会爆炸");
        amb.setGoods(goods);
    }
    public void setString(){
        amb.setStr("小明");
    }
    public void setList(){

        ArrayList<String> strings = new ArrayList<>();
        for(int i=0;i<10;i++){
            strings.add("小明明"+i);
        }
        amb.setList(strings);
    }
     public  void  setMap() {
         HashMap<String, String> map = new HashMap<>();
         map.put("name", "xiaomi6");
         map.put("price", "2999");
         map.put("desc", "双蛇");
         amb.setMap(map);
     }

    public void click(View v){
        Goods goods = new Goods("iphone8",((float)(Math.random()*100.0f)),"会爆炸");
        amb.setGoods(goods);
    }

}
