package com.hillel.artemjev.homework_6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IpSearcher {
    private static final String IP_V4_PATTERN =
            "\\b([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\b";
//    В начале и в конце регуляного выражения добавил разделитель слова,
//    но не уверен что это правильно(не совсем понятно из условия как имеено ip адреса должны выбираться из текста,
//    если будут замеччания - исправлю).

    public static List<String> serchIpV4(String text) {

        Pattern pattern = Pattern.compile(IP_V4_PATTERN);
        Matcher matcher = pattern.matcher(text);

        List<String> ipList = new ArrayList<>();
        while (matcher.find()) {
            ipList.add(matcher.group());
        }
        return ipList;
    }
}
