package org.example;

import allFunctions.orangeMoney.OrangeMoneyStructure;
import allFunctions.scanner.UssdStructure;

public class Main {
    public static void main(String[] args) {
        UssdStructure ussdStructure = new UssdStructure();
        OrangeMoneyStructure orangeMoneyStructure = new OrangeMoneyStructure();
        orangeMoneyStructure.setUssdStructure(ussdStructure);
        orangeMoneyStructure.OrangeMoney();
    }
}