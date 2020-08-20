package com.ty.controller;

import com.ty.service.OwnersMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ownersMap")
public class OwnersMapController {
    @Autowired
    private OwnersMapService ownersMapService;

}
