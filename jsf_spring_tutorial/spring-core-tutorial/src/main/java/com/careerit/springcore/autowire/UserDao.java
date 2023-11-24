package com.careerit.springcore.autowire;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDao {


        private List<String> users;

        @PostConstruct
        public void init(){
            users = List.of("Krish","Manoj","Charan","Tanvi","Rajesh","Suresh","Jayesh","Mahesh");
        }
        public List<String> search(String str){

            List<String> list = new ArrayList<>();
            for(String name:users){
                if(name.toLowerCase().contains(str.toLowerCase())){
                    list.add(name);
                }
            }
            return list;

        }
}
