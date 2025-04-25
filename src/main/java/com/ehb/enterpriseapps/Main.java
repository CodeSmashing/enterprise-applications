package com.ehb.enterpriseapps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opdracht 1
        // Zorg voor een methode die priemgetallen berekent, een priemgetal is
        // enkel deelbaar door 1 en zichzelf. Via deze methode druk je alle Priemgetallen af tussen
        // 1 en 100.
        PrimeCalculator.calculator();

        // Opdracht 2
        // Maak een klasse Snack, instanties hiervan stellen snacks in een frituur voor. Elke
        // snack heeft een artikelcode, naam en prijs, denk zelf over de meest geschikte types.
        // Zorg voor een default constructor en de nodige getters en setters.
        // Op termijn moeten deze gesorteerd kunnen worden op naam en over een
        // verbinding worden doorgestuurd. Voorzie hiervoor de nodige interfaces.
        Snack snack1 = new Snack("Frikandel", 2.50);
        Snack snack2 = new Snack("Bitterbal", 1.50);
        Snack snack3 = new Snack("Kroket", 2.00);
        Snack snack4 = new Snack("Kaassoufflé", 2.20);

        ArrayList<Snack> snacks = new ArrayList<>();

        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);
        snacks.add(snack4);

        System.out.println("\nSnacks:");
        for (Snack snack : snacks) {
            System.out.println("Artikelcode: " + snack.getArticleCode() + ", Naam: " + snack.getName() + ", Prijs: " + snack.getPrice());
        }

        snacks.sort(Snack::compareTo);
        System.out.println("\nGesorteerde Snacks:");
        for (Snack snack : snacks) {
            System.out.println("Artikelcode: " + snack.getArticleCode() + ", Naam: " + snack.getName() + ", Prijs: " + snack.getPrice());
        }

        // Opdracht 3
        // Zorg voor een klasse waarbinnen je een lijst van snacks kan bijhouden. Deze bevat
        // overal in de applicatie dezelfde waarden, voeg hiervoor het juiste keyword toe. De
        // klasse bevat tevens methoden om alle snacks op te vragen, snacks toe te voegen en
        // snacks te verwijderen. Indien je dit volledig volgens de regels van de kunst wil doen
        // mag je gerust een Singleton pattern opzoeken.
        SnackController snackController = SnackController.getInstance();

        snackController.addSnack(snack1);
        snackController.addSnack(snack2);
        snackController.addSnack(snack3);
        snackController.addSnack(snack4);
        System.out.println("\nSnacks:");
        for (Snack snack : snackController.getSnackList()) {
            System.out.println("Artikelcode: " + snack.getArticleCode() + ", Naam: " + snack.getName() + ", Prijs: " + snack.getPrice());
        }

        snackController.removeSnack(snack2);
        snackController.removeSnack(snack3);
        snackController.removeSnack(snack4);
        System.out.println("\nRemaining snacks:");
        for (Snack snack : snackController.getSnackList()) {
            System.out.println("Artikelcode: " + snack.getArticleCode() + ", Naam: " + snack.getName() + ", Prijs: " + snack.getPrice());
        }
    }
}
