package object_Demo1;

import Object_Demo.Publicdemo;

public class Publicdemo3 {

	public static void main(String[] args) {
		System.out.println(Publicdemo.b);
		Publicdemo.m2();
		//non-static
		Publicdemo a1=new Publicdemo();
		System.out.println(a1.a);
		a1.m1();
	}

}
