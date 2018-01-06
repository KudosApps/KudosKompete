package com.github.kudoskompete.controllers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldControllerTest {
    @Test
    public void shouldSayHelloWorld() {
        HelloWorldController controller = new HelloWorldController();
        String result = controller.hello();
        assertThat(result, is("Hello World"));
    }
}