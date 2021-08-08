package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd()
    {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = applicationContext.getBean(Board.class);
        board = 
        //When
        boolean result = applicationContext.containsBean("board");
        //Then
        System.out.println("Bean found in container: " + result);
    }
}
