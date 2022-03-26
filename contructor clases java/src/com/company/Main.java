package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData=new Scanner(System.in);
        String productName;
        String productBrand;
        System.out.println("Ingrese el nombre del producto");
        productName=inputData.nextLine();
        System.out.println("Ingrese la marca del producto");
        productName=inputData.nextLine();
        productBrand=inputData.nextLine();
        Producto monitorhp=new Producto(productName);
        Producto hp=new Producto(productBrand);
        String name =monitorhp.getName();
        System.out.println(name);
    }
}
