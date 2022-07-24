
package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import ru.netology.sqr.javaqamvn.services.SQRService;

public class SQRServiceTest {
    @Test
    public void test1() {
        SQRService service = new SQRService();
        long lowlimit = 200;
        long toplimit = 300;
        long expected = 3;
        long actual = service.amountSquare(lowlimit, toplimit);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        SQRService service = new SQRService();
        long lowlimit = 300;
        long toplimit = 400;
        long expected = 3;
        long actual = service.amountSquare(lowlimit, toplimit);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        SQRService service = new SQRService();
        long lowlimit = 1600;
        long toplimit = 3599;
        long expected = 20;
        long actual = service.amountSquare(lowlimit, toplimit);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {

        SQRService service = new SQRService();
        long lowlimit = 100000;
        long toplimit = 2000000;
        long expected = 0;
        long actual = service.amountSquare(lowlimit, toplimit);
        assertEquals(expected, actual);
    }
}
