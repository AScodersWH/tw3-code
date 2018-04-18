package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Reduce implements SingleLink<Integer> {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Integer getHeaderData(){
        return arrayList.get(0);
    }

    @Override
    public Integer getTailData() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public int size(){
        return arrayList.size();
    }
    @Override
    public boolean isEmpty(){
        return  arrayList.isEmpty();
    }
    @Override
    public boolean deleteFirst(){
        Integer first=getHeaderData();
        return arrayList.remove(first);
    }
    @Override
    public boolean deleteLast(){
        Integer end=getTailData();
        return arrayList.remove(end);
    }
    @Override
    public void addHeadPointer(Integer item){
        arrayList.add(0,item);
    }
    @Override
    public void addTailPointer(Integer item){
        arrayList.add(item);
    }
    @Override
    public Integer getNode(int index){
        return arrayList.get(index-1);
    }

    public int getMaximum() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.decendofList(arrayList);
        return list.get(0);
    }
