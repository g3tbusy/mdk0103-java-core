package javabase;

import java.time.LocalTime;

public class Robot
{
    public static void main(String[] args)
    {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        int currentMinute = currentTime.getMinute();

        if((currentHour >= 4) && (currentHour < 12))
        {
            System.out.println("Доброе утро! Время сейчас " + currentHour + ":" + currentMinute);
        }

        if((currentHour >= 12) && (currentHour < 18))
        {
            System.out.println("Добрый день! Время сейчас " + currentHour + ":" + currentMinute);
        }

        if(((currentHour >= 18) && (currentHour <= 23)) || ((currentHour >= 23) || (currentHour <= 3)))
        {
            System.out.println("Добрый вечер! Время сейчас " + currentHour + ":" + currentMinute);
        }
    }
}