package me.devdoso.elsneaker.utils;

public class IntegerCheck {

    public static boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
}
