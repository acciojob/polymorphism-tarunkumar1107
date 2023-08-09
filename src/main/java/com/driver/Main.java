package com.driver;

public class Main {
    public static class Product{

        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();
        int product = p.product(1, 2);
        int product1 = p.product(1, 2, 3);
        double product2 = p.product(1.23, 1.67);
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);


    }
}
