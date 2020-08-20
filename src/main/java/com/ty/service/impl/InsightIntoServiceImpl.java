package com.ty.service.impl;

import com.ty.mapper.InsightIntoMapper;
import com.ty.service.InsightIntoService;
import com.ty.vo.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsightIntoServiceImpl implements InsightIntoService {
    @Autowired
    private InsightIntoMapper insightIntoMapper;
    @Override
    public Dealer getDealer(String name) {
        return insightIntoMapper.selectByName(name);
    }
}
