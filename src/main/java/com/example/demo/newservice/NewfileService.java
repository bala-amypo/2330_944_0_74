package com.example.demo.newservice;

import com.example.demo.newentity.NewFileEntity;
import java.util.*;

public interface NewfileService{
    NewFileEntity savedata(NewFileEntity st);
    NewFileEntity getidval(Long id);
    List<NewFileEntity> getalldata();
    NewFileEntity update(Long id,NewFileEntity st);
    void del(Long id);
}