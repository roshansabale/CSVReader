package com.bridgelabz;

public class CSVBuilderFactory {
    public static ICSVBuilder createCSVBuilder() {
        return new CSVBuilder();
    }
}
