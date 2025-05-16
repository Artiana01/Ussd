package org.example;

import org.example.allFunctions.orangeMoney.OrangeMoneyStructure;
import org.example.allFunctions.scanner.UssdStructure;



public class Main {
    public static void main(String[] args) {
        UssdStructure ussdStructure = new UssdStructure();
        OrangeMoneyStructure orangeMoneyStructure = new OrangeMoneyStructure();
        orangeMoneyStructure.setUssdStructure(ussdStructure);
        orangeMoneyStructure.OrangeMoney();
    }
}
