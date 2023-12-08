package com.careerit.wsp.service;

import java.util.List;

public class RequestContextProvider {
    private static int count = 0;
    private RequestContextProvider(){
    }
    public static String getUserName(){
        count++;
        List<String> list = List.of("Krish", "Manoj");
        if(count % 2 == 0){
            return list.get(0);
        }else{
            return list.get(1);
        }
    }
}
