package main;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LambdaUtils
{

    public static <T> void forEachWithDelay(List<T> list, int delay, Printing<T> lambda) throws InterruptedException {
        for(T item : list)
        {
            TimeUnit.SECONDS.sleep(5);
            lambda.get(item);
        }
    }

    @FunctionalInterface
    public interface Printing <T>
    {
        void get(T item);
    }

}
