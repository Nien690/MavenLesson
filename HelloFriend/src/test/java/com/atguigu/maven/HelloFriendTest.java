package com.atguigu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * @author Nien
 * @create 2020-03-30
 */
public class HelloFriendTest {
    @Test
    public void testHelloFriend(){
        HelloFriend helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloToFriend("honghong");
        System.out.println(results);
//        assertEquals("Hello honghong I am songsong",results);
        assertEquals("Hello honghong! I am songsong",results);
    }

}
