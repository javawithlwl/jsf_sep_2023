package com.careerit.cj.day21;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;

record Account(int accno, String name, double balance) {
}

public class JsonManager {

    @SneakyThrows
    public static void main(String[] args) {
        String jsonStr = """
                                
                {
                    "accno":1001,
                    "name":"Krish",
                    "balance":10000.00
                }
                """;
        String jsonAccountsStr = """
                [
                {
                    "accno":1001,
                    "name":"Krish",
                    "balance":10000.00
                },
                {
                    "accno":1002,
                    "name":"Manoj",
                    "balance":20000.00
                },
                {
                    "accno":1003,
                    "name":"Charan",
                    "balance":30000.00
                }
                ]
                """;
        ObjectMapper objMapper = new ObjectMapper();
        Account acc = objMapper.readValue(jsonStr, Account.class);
        System.out.println(acc);

        // Convert object to json string
        String json = objMapper.writeValueAsString(acc);
        System.out.println(json);
        List<Account> accounts = objMapper.readValue(jsonAccountsStr, new TypeReference<>() {});
        System.out.println(accounts);
    }

}
