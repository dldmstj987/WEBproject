package com.WebProject.SPACEbar.controller;

import lombok.extern.log4j.Log4j2;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;
@Controller
@RequestMapping("mainhome")
@Log4j2
public class MainController {

    @GetMapping("/main")
    public void main(){

    }

}
