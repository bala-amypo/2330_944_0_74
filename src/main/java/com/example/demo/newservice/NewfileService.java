package com.example.demo.newservice;

import com.example.demo.newentity.NewFileEntity;

public interface NewfileService{
    NewFileEntity savedata(NewFileEntity st);
    NewFileEntity getidval(Long id);
    List<NewFileEntity> getalldata();
}