package ru.masloboev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.masloboev.springcourse.models.Calculator;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    public Calculator calculator;

    @Autowired
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping()
    public String actions() {
        return "calculator/actions";
    }

    @GetMapping("/addition")
    public String addition(@ModelAttribute("calculator") Calculator calculator) {
        return "calculator/addition";
    }

    @PostMapping()
    public String add(@ModelAttribute("calculator") Calculator calculator) {
        return "redirect:/calculator/addition";
    }