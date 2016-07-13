package com.structural.bridge.complexdemos.movieprinterbridge;

import com.structural.bridge.complexdemos.movieprinterbridge.entities.Movie;
import com.structural.bridge.complexdemos.movieprinterbridge.formatters.Formatter;
import com.structural.bridge.complexdemos.movieprinterbridge.formatters.HTMLFormatter;
import com.structural.bridge.complexdemos.movieprinterbridge.formatters.PrintFormatter;
import com.structural.bridge.complexdemos.movieprinterbridge.printers.MoviePrinter;
import com.structural.bridge.complexdemos.movieprinterbridge.printers.Printer;


/*
*
*   This is yet another example of implementing a bridge.
*
*   The Formatter and Printer classes are what is being separated here. This is achieved by using Composition to inject
*   a Formatter into the print method of the Printer class.
*
*   We have 2 examples of Formatters here, the PrintFormatter and the HTMLFormatter. These were easily created by implementing
*   the Formatter interface and implementing it's print method to do anything specific.
*
*
* */


public class MoviePrinterBridgeDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Horror");
        movie.setTitle("The Conjuring");
        movie.setRuntime("2:00");
        movie.setYear("2014");

        Formatter printerFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String printedMaterial = moviePrinter.print(printerFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HTMLFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}
