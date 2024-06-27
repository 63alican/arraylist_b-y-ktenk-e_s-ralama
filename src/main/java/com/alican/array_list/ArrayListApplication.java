package com.alican.array_list;
import java.util.ArrayList;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayListApplication {

	public static void main(String[] args) {

		SpringApplication.run(ArrayListApplication.class, args);
		ArrayList<Integer>degerler =new ArrayList<Integer>();
		degerler.add(1);
		degerler.add(2);
		degerler.add(6);
		degerler.add(48);
		Collections.sort(degerler);

		for (int i : degerler) {
			System.out.println(i);

		}






	}

}
