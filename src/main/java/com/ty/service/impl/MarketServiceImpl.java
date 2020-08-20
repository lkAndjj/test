package com.ty.service.impl;

import com.ty.mapper.MarketMapper;
import com.ty.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketMapper marketMapper;
}
