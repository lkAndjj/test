package com.ty.controller;

import com.ty.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketService marketService;
}
