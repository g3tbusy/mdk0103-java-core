package javabase.Alpinist;

import static javabase.Alpinist.Alpinist.*;
import static javabase.Alpinist.CreateAlpinist.*;
import static javabase.Alpinist.Mountain.*;
public class groupJoinCheck
{
    public static boolean isJoinOpened1 = true;
    public static boolean isJoinOpened2 = true;
    public static boolean isJoinOpened3 = true;
    public static void isJoinOpened()
    {
        if ((alpinist1.getName() != "NULL") && (alpinist2.getName() != "NULL") && (alpinist3.getName() != "NULL"))
        {
            isJoinOpened1 = false;
        }

        if ((alpinist4.getName() != "NULL") && (alpinist5.getName() != "NULL") && (alpinist6.getName() != "NULL"))
        {
            isJoinOpened2 = false;
        }

        if ((alpinist7.getName() != "NULL") && (alpinist8.getName() != "NULL") && (alpinist9.getName() != "NULL"))
        {
            isJoinOpened3 = false;
        }
    }
}123
