package com.example;

enum Currency{
    PLN, USD, EUR
}

public class MainProgram {

    public static void main(String[] args){

        /**
         * Utwórz klasę Money, z konstruktorem uzupełniającym prywatne składowe o nazwach: value oraz currency
         */
//        Money dziesiecZlotych = new Money(10.00, Currency.PLN);
//        Money piecDolarow = new Money(5, Currency.USD);
//        Money dwaEuro = new Money(2, Currency.EUR);
        /**
         * Dodaj gettery do pól value oraz currency
         */
//        if(dziesiecZlotych.getValue() != 10.00){
//            System.out.println("getter nie zwraca poprawnej wartości");
//            return;
//        }
//        if(dziesiecZlotych.getCurrency()!= Currency.PLN){
//            System.out.println("getter nie zwraca poprawnej wartości waluty");
//            return;
//        }
        /**
         * Dodaj klasę Wallet (portfel), która będzie przetrzymywać obiekty typu Money
         *
         */
//        Wallet portfel = new Wallet();

        /**
         * dodaj metodę add, która pozwoli na dodawanie pieniędzy do portfela
         */

//        portfel.add(dziesiecZlotych);
//        portfel.add(piecDolarow);
//        portfel.add(dwaEuro);

        /**
         * Nadpisz metodę toString w klasie Wallet która zwróci napis mówiący ile mamy pieniedzy w portfelu
         * np.
         * W portfelu mam:
         * 10 PLN
         * 5 USD
         * 2 EUR
         */

//        if(portfel.toString().contains("Wallet")){
//            System.out.println("metoda toString została źle nadpisana");
//            return;
//        }
//

        /**
         * utwórz klasę CurrencyChanger, która ma dwa pola statyczne określający aktualny kurs waluty
         * do przeliczania złotówek na dolary i euro
         */
//        CurrencyChanger.PLN_TO_USD = 4.0; //4 PLN to 1 USD
//        CurrencyChanger.PLN_TO_EUR = 5.0; //5 PLN to 1 EUR

        /**
         * dodaj metodę exchange która będzie potrafiła wymieniać pieniądze z danego portfela
         * na pieniądze określonej waluty
         */
//        Money zlotowki = CurrencyChanger.exchange(portfel, Currency.PLN);
//
//        if(zlotowki.getValue()!= 40.0 && !zlotowki.getCurrency().equals(Currency.PLN)){
//            System.out.println("wymiana waluty zle dziala");
//        }
//
//        Money dolary = CurrencyChanger.exchange(portfel, Currency.USD);
//
//       if(dolary.getValue()!= 10.0 && !zlotowki.getCurrency().equals(Currency.USD)){
//            System.out.println("wymiana waluty zle dziala");
//        }
//
        /**
         * Nadpisz metodę equals tak aby porównywała wartość portfeli tzn. czy wartości zgromadzonych pieniędzy są sobie równe
         */

//        Wallet drugiPortfel = new Wallet();
//        drugiPortfel.add(new Money(5, Currency.PLN));
//        drugiPortfel.add(new Money(5, Currency.PLN));
//        drugiPortfel.add(new Money(2.5, Currency.USD));
//        drugiPortfel.add(new Money(2.5, Currency.USD));
//        drugiPortfel.add(new Money(1.5, Currency.EUR));
//        drugiPortfel.add(new Money(0.5, Currency.EUR));
//        if(!portfel.equals(drugiPortfel)){
//            System.out.println("Metoda eqauls nie działa poprawnie.");
//            return;
//        }
//
//        System.out.println("Koniec");
    }

}
