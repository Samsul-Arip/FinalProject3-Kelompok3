package com.samsul.finalproject3_kelompok3;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    double result = 0;

    void resultSummation(String firstNumber, String secondNumber) {
        result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
    }
    void resultSubtraction(String firstNumber, String secondNumber) {
        result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
    }
    void resultMultiplication(String firstNumber, String secondNumber) {
        result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
    }
    void resultDistribution(String firstNumber, String secondNumber) {
        result = (float) Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
    }
    void resultModulo(String firstNumber, String secondNumber) {
        result = Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber);
    }
}
