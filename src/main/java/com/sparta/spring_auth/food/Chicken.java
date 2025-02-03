package com.sparta.spring_auth.food;

import com.sparta.spring_auth.food.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 같은 타입의 빈이 여러개 있더라도 해당 빈을 우선적으로 처리해준다.
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}