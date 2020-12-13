package com.hillel.artemjev.homework_6_2;

public class Main {

    public static void main(String[] args) {

        String text = "какой-то произвольный текст 127.0.0.1\nНе знаю что писать 10.128.17.14 тык " +
                "айпишник, тык еще один 10.130.24.1 255.255.12.0-чем больше, тем лучше." +
                "79.0.0.1. 10.129 .17\n 000.255.255.255. 777.14.155.122," +
                " 000.255.255.255.121 ud";

        System.out.println("В тексте:");
        System.out.println("\n\"" + text + "\"\n");
        System.out.println(", найдены следующие IP адреса:");
        for (String ip : IpSearcher.serchIpV4(text)) {
            System.out.println(ip);
        }
    }
}
