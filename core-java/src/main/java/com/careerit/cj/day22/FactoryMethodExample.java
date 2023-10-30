package com.careerit.cj.day22;

interface Currency {
    String getSymbol();
}

class India implements Currency {
    public String getSymbol() {
        return "Rs";
    }

}

class USA implements Currency {
    public String getSymbol() {
        return "$";
    }
}

class UK implements Currency {
    public String getSymbol() {
        return "£";
    }

}

enum CountryCodes {
    IND, USA, UK
}

public class FactoryMethodExample {

    public static void main(String[] args) {
        Currency currency = getInstance(CountryCodes.USA);
        System.out.println(currency.getSymbol());
    }
    // Factory method
    public static Currency getInstance(CountryCodes code) {
        switch (code) {
            case IND:
                return new India();
            case USA:
                return new USA();
            case UK:
                return new UK();
            default:
                throw new IllegalArgumentException("Invalid country code");
        }
    }
}
