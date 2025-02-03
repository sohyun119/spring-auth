package com.sparta.spring_auth;

import com.sparta.spring_auth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;

    @Autowired
    @Qualifier("pizza") // 이것을 선언해준 빈을 찾아온다.
    Food food;

    @Test
    @DisplayName("테스트")
    void test1(){
        food.eat();
    }


}
