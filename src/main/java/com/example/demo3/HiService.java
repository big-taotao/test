package com.example.demo3;

import com.example.demo3.cache.CacheNames;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HiService {

    @Cacheable(value = CacheNames.app, key = "'user-1'")
    public String getName() {
        Random random = new Random();
        return random.nextFloat() + "-User";
    }

    @Cacheable(value = CacheNames.temp, key = "'user-2'")
    public String getName2() {
        Random random = new Random();
        return random.nextFloat() + "-User";
    }

}
