package com.example.ex00.dependency;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Coding {
    @Autowired
    private Computer computer;
}
