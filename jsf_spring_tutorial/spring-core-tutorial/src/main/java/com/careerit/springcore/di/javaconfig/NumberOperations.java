package com.careerit.springcore.di.javaconfig;

import com.careerit.common.util.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberOperations {

        @Autowired
        private Sort sort;
        public void showNumbers(int[] arr){
            int[] sortedArr = sort.sort(arr);
            for(int ele:sortedArr){
                System.out.println(ele);
            }
        }
}
