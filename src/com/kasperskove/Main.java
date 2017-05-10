package com.kasperskove;

public class Main {

    public static void main(String[] args) {
	// scratchpad... go crazy
        System.out.printf(titleCase("Heelllooo world its me"));
    }


    public static String titleCase(String string){
        // Write a headerliner(string) function that converts a string to title case (This Is Title Case).

        // lowercase String so we only have to deal with first char per word
        string.toLowerCase();
        // how to get first char in each word
        string.charAt(0);

        //

        return string;
    }
}
