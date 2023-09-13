package com.numerous.tmytools.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextTools {

    public static String source = "";

    public static void main(String[] args) {

        List<String> list = Arrays.asList(source.toString().toString().split("\n"));
        List<String> content = new ArrayList<>();

        for (String s : list) {
            if(s.startsWith("[name=\"")) {
                content.add(s.replace("[name=\"", "").replace("\"]", "："));
            }
            if(!s.startsWith("[")) {
                content.add(s);
            }
            if(s.startsWith("[Decision(options=\"")) {
                String temp = s.substring("[Decision(options=\"".length(), s.lastIndexOf("\","));
                content.add("博士：" + temp.split(";")[0]);
            }
            if(s.startsWith("[Subtitle(text=\"")) {
                content.add(s.substring("[Subtitle(text=\"".length(), s.indexOf("\", ")));
            }
        }

        for (String s : content) {
            System.out.println("<p>" + s + "</p>");
        }

    }

}
