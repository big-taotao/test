package com.example.demo3.cache;

import java.util.Arrays;
import java.util.List;

public interface CacheNames {

    String app = "app";
    String temp = "temp";

    static List<String> list() {
        return Arrays.asList(app, temp);
    }
}