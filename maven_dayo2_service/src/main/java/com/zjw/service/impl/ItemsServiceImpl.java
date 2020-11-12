package com.zjw.service.impl;

import com.zjw.dao.ItemsDao;
import com.zjw.domain.Items;
import com.zjw.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {

        return itemsDao.findById(id);
    }
}
