package ru.netology.sqr.javaqamvn.services;

import javax.swing.*;

public class SQRService {
    public int amountSquare(long lowLimit, long topLimit){
        int amount=0;
        for (int i = 10; i <= 99; i++){
            if (i*i <= topLimit){
                if (i * i >= lowLimit){
                    amount++;
                }
            }
        }

        return amount;
    }
}
