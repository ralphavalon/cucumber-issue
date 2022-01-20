package com.demo.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.cucumber.core.cli.Main;

public class TestRunner {

    public static void main(String[] args) {
        String[] argv = new String[] { "-m", "--glue", "com.demo.project" };
        List<String> arguments = new ArrayList<>();
        arguments.addAll(Arrays.asList(argv));
        arguments.addAll(Arrays.asList(new String[] { "classpath:features" }));

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Main.run(arguments.toArray(new String[0]), contextClassLoader);
    }

}
