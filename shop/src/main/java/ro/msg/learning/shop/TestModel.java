package ro.msg.learning.shop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("singleton")
public class TestModel {
    private String name;
    private int age;

    public TestModel() {
        System.out.println("------------------->  S-A FACUT O INSTANTA");
    }

    public void print(){
        System.out.println("-------------------------------->" + name);
    }
}
