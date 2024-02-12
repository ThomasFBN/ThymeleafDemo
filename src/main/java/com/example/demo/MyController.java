package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Controller
public class MyController {
    @GetMapping("Hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "world");
        return "greeting";
    }

    @GetMapping("/Today")
    public String getToday(Model model) {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        model.addAttribute("currentDate", formattedDate);
        return "today";

    }
}
