/*
 * @(#)HelloController.java 2021-04-05
 *
 * Copyright 2021 Etoos Education. All rights Reserved.
 * Etoos Education PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 김원영 kwy@platb.ai
 * @since 2021-04-05
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
