package com.coders.lambdaexpresions;

@FunctionalInterface
interface Drwable{
        public void draw(); // abstract method
}

class Test implements Drwable{
        int width=10;

        @Override
        public void draw() {
                System.out.println("drwaing "+width);
        }
        
}

public class Withoutlamdaexpression1 {
	public static void main(String[] args) {
        Drwable d=new Dra();
        d.draw();
}

}

