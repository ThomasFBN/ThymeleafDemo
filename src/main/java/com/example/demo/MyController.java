package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

@Controller
public class MyController {

    private PersonService personService;
    public MyController(PersonService personService){
        this.personService = personService;
    }

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

    /*@GetMapping("/find")
    public String getPerson(Model model) {
        Person fred = personService.findPerson("fred");
        model.addAttribute("person", fred);
        return "show";
    }
*/
    @GetMapping("/friday")
    public String getDayOfWeek(Model model) {
        LocalDate today = LocalDate.now();
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        model.addAttribute("currentDayOfWeek", dayOfWeek);
        return "friday";
    }

    @GetMapping("/findall")
    public String getAll(Model model){
        List<Person> people = personService.findAll();
        model.addAttribute("list",people);
        return "aldertjek";
    }
}
