package com.ty.controller;

import com.ty.service.DataListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dataList")
public class DataListController {

    private DataListService dataListService;
}
