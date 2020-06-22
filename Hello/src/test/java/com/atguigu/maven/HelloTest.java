package com.atguigu.maven;
import static junit.framework.Assert.*;
import org.junit.Test;

/**
 * @author Nien
 * @create 2020-03-30
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String results = hello.sayHello("atguigu");
        //断言，如果测试后和预计的值不一样就会报错，下图是结果一直通过了
        assertEquals("Hello atguigu!",results);
    }
}
