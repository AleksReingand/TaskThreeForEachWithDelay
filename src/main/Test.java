package main;

import java.util.Arrays;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws InterruptedException {
        List<String> strings = Arrays.asList("One", "Two", "Three");
        LambdaUtils.forEachWithDelay(strings, 5, (item) -> System.out.println(item));
    }
}
