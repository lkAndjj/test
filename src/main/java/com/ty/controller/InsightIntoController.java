package com.ty.controller;

import com.ty.service.InsightIntoService;
import com.ty.vo.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/InsightInto")
public class InsightIntoController {
    @Autowired
    private InsightIntoService insightIntoService;
    @RequestMapping("/dealer")
    public  void  getDealer(@RequestParam String name){
        Dealer dealer=insightIntoService.getDealer(name);
        System.out.println(dealer);

    }
}
