package com.dailycodebuffer.example.collection;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "person")
public class Person {
    private String personId;
    private String firstname;
    private String lastName;
    private Integer age;
    private List<String> hobbies;
}
