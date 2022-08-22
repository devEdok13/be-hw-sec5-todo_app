package com.codestates.todo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/")
  public String helloWorld() {
    return "<h1>Todo Application!</h1>";
  }
}
