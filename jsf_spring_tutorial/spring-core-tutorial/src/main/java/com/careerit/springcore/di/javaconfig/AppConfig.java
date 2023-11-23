package com.careerit.springcore.di.javaconfig;

import com.careerit.common.util.BubbleSort;
import com.careerit.common.util.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean
        public Printer sonyPrinter(){
            return new SonyPrinter();
        }
        @Bean
        public Printer hpPrinter(){
            return new HpPrinter();
        }

        @Bean
        public Sort sort(){
            return new BubbleSort();
        }

        @Bean
        public PrinterService printerService(@Qualifier("sonyPrinter") Printer printer){
            PrinterService printerService = new PrinterService();
            printerService.setPrinter(printer);
            return printerService;
        }
}
