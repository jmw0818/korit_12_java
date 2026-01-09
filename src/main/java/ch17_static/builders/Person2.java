package ch17_static.builders;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person2 {
    private String name;
    private int age;
    private String address;
}
