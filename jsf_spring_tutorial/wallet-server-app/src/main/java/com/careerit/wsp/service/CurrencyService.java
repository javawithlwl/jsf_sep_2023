package com.careerit.wsp.service;

import com.careerit.wsp.records.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@Slf4j
public class CurrencyService {

        List<String> supportedCurrencyList = List.of("USD","INR","CNY");
        public List<Currency> supportedCurrencies(){
            RestClient restClient = RestClient.create();
            List<Currency> currencyList = restClient.
                    get()
                    .uri("https://currency-server-app.onrender.com/api/currency/all")
                    .retrieve()
                    .body(new ParameterizedTypeReference<List<Currency>>() {});
            if(currencyList == null){
                throw new RuntimeException("Unable to get the currencies");
            }
            List<Currency> filteredList = currencyList.stream().filter(currency -> {
                return supportedCurrencyList.contains(currency.code());
            }).toList();
            log.info("Supported currencies are : {}",filteredList);
            return filteredList;
        }
}
