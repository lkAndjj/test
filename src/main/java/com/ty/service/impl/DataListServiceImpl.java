package com.ty.service.impl;

import com.ty.mapper.DataListMapper;
import com.ty.service.DataListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataListServiceImpl implements DataListService {

    @Autowired
    private DataListMapper dataListMapper;
}
