package test;

import org.junit.Assert;
import org.junit.Test;
import src.FizzBuzz;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void test(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList fizzes = new ArrayList();
        for(int i = 1; i <= 100; i++){
            fizzes.add(fizzBuzz.action(i));
        }
        System.out.println(""+ fizzes.toString());
        Assert.assertEquals(100, fizzes.size());

        Assert.assertEquals("1", fizzBuzz.action(1));
        Assert.assertEquals("2", fizzBuzz.action(2));
        Assert.assertEquals("Fizz", fizzBuzz.action(3));
        Assert.assertEquals("4", fizzBuzz.action(4));
        Assert.assertEquals("Buzz", fizzBuzz.action(5));
        Assert.assertEquals("Fizz", fizzBuzz.action(6));
        Assert.assertEquals("FizzBuzz", fizzBuzz.action(15));

    }
}
