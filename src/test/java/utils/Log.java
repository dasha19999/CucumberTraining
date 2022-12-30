package utils;

import org.apache.log4j.*;

public class Log {

    public static Logger Log = Logger.getLogger(Log.class.getName());

    public static void startTest(String message){

        Log.info("\n************ " + message + "**************\n");

    }

    public static void endTest(String message){

        Log.info("\n############   " + message + " ################\n");

    }

    //to print some text in between my code
    public static void info(String message){
        Log.info(message);
    }
    public static void warning(String warning){
        Log.info(warning);
    }
}
