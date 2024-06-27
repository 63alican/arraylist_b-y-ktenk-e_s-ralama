package com.alican.array_list;
import java.util.ArrayList;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayListApplication {

	public static void main(String[] args) {

		int sayi_1=5;
		int sayi_2=9;
		int sayi_3=7;
		int sayi_4=15;


		SpringApplication.run(ArrayListApplication.class, args);
		ArrayList<Integer>degerler =new ArrayList<Integer>();
		degerler.add(sayi_1);
		degerler.add(sayi_2);
		degerler.add(sayi_3);
		degerler.add(sayi_4);
		System.out.println(degerler);






		}






	}

}
