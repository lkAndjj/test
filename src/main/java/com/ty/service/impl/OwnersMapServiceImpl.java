package com.ty.service.impl;

import com.ty.mapper.OwnersMapMapper;
import com.ty.service.OwnersMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnersMapServiceImpl implements OwnersMapService {
    @Autowired
    private OwnersMapMapper ownersMapMapper;

}
