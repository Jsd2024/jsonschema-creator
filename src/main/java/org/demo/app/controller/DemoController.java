package org.demo.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.io.*;
import java.util.*;
import java.util.function.Function;

import static java.lang.Integer.valueOf;
import org.springframework.stereotype.Controller;


@Controller
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    public String getEmpData() {
        return "test";

    }
}


