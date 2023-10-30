package com.careerit.cj.day24;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

class MyOwnResource implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closing the resource");
    }
    public void resourceInfo(){
        System.out.println("JDK version : "+Runtime.version()+"\nOS : "+System.getProperty("os.name"));
    }
}
public class CheckedExceptionExample {

    public static void main(String[] args) {
        readDataFromFile();
       /* Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2:");
            int num2 = sc.nextInt();
            System.out.println("Enter the operator:");
            String operator = sc.next();
            try {
                int res = perform(num1, num2, operator);
                System.out.println("Result : " + res);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            System.out.println("Do you want to continue (yes/no):");
            String choice = sc.next();
            if (choice.equals("no")) {
                break;
            }
        }*/
        showFileContentWithResourceHandle();
    }

    public static void showFileContentWithResourceHandle() {


        try (
                FileReader fr = new FileReader(new File(CheckedExceptionExample.class.getResource("/product.csv").getFile()));
                BufferedReader br = new BufferedReader(fr);
                MyOwnResource myOwnResource = new MyOwnResource();
        ) {
            myOwnResource.resourceInfo();
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("After while loop");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Finally block");
        }

    }

    public static void showFileContent() {

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File(CheckedExceptionExample.class.getResource("/product.csv").getFile()));
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readDataFromFile() {
        try {
            List<String> list = Files.readAllLines(Paths.get(new File(CheckedExceptionExample.class.getResource("/product.csv").getFile()).getAbsolutePath()));
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int perform(int a, int b, String ope) {
        return switch (ope) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("Denominator should not be zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        };

    }
}
