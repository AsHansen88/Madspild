package com.example.madspild.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Madspild {

    @GetMapping("/")
    public String index(){
      return "index";

    }

      @GetMapping("/Info")
    public String about(){
      return "Info";
    }

      @GetMapping("/Opskrifter")
    public String Opskrifter(){
      return "Opskrifter";
    }

    @GetMapping("/Tegneserie")
  public String Tegneserie(){
    return "Tegneserie";
  }

    @GetMapping("/Undgå")
  public String Undgå(){
    return "Undgå";
  }

}

