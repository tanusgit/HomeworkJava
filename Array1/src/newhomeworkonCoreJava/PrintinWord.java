package newhomeworkonCoreJava;

import java.util.stream.Stream;

public class PrintinWord {
public static void main(String[] args) {
	//printten(333);
	//print(54);
   int num = 223;
   
   if(num % 100 > 9) {
	   int res = (num % 100)%10;
	   printten(num%100);
	   print(res);
   }
	
	
}


private static void print(int i) {
	// TODO Auto-generated method stub
	if(i == 1) {
		System.out.println("one");
	}else if(i == 2) {
		System.out.println("two");
	}
	else if(i == 3) {
		System.out.println("three");
	}
	else if(i == 4) {
		System.out.println("four");
	}
	else if(i == 5) {
		System.out.println("five");
	}
	else if(i == 6) {
		System.out.println("six");
	}
	else if(i == 7) {
		System.out.println("seven");
	}
	else if(i == 8) {
		System.out.println("eight");
	}
	else if(i == 9) {
		System.out.println("nine");
	}
	else if(i == 0) {
		System.out.println("zero");
	}
	
	
}


private static void printten(int i) {
	// TODO Auto-generated method stub
	if(i == 10) {
		System.out.println("ten");
	}else if(i == 11) {
		System.out.println("eleven");
	}
	else if(i == 12) {
		System.out.println("tweleve");
	}
	else if(i == 13) {
		System.out.println("thirteen");
	}
	else if(i == 14) {
		System.out.println("fourteen");
	}
	else if(i == 15) {
		System.out.println("fiveteen");
	}
	else if(i == 16) {
		System.out.println("sixteen");
	}
	else if(i == 17) {
		System.out.println("seventeen");
	}
	else if(i == 18) {
		System.out.println("eighteen");
	}
	else if(i == 19) {
		System.out.println("ninety");
	}
	else if(i >= 20 && i < 30) {
		System.out.println("twenty");
	}
	else if(i >= 30 && i < 40) {
		System.out.println("thirty");
	}
	else if(i >= 40 && i < 50) {
		System.out.println("forty");
	}
	else if(i >= 50 && i < 60) {
		System.out.println("fifty");
	}
	else if(i >= 60 && i < 70) {
		System.out.println("sixty");
	}
	else if(i >= 70 && i < 80) {
		System.out.println("seventy");
	}
	else if(i >= 80 && i < 90) {
		System.out.println("eighty");
	}
	else if(i >= 90 && i < 100) {
		System.out.println("ninety");
	}
	
	else if(i >= 100 && i < 200) {
		System.out.println("one hundred");
	}
	else if(i >= 200 && i < 300) {
		System.out.println("two hundred");
	}
	else if(i >= 300 && i < 400) {
		System.out.println("three hundred");
	}
	else if(i >= 400 && i < 500) {
		System.out.println("four hundred");
	}
	else if(i >= 500 && i < 600) {
		System.out.println("five hundred");
	}
	else if(i >= 600 && i < 700) {
		System.out.println("six hundred");
	}
	else if(i >= 700 && i < 800) {
		System.out.println("seven hundred");
	}
	else if(i >= 800 && i < 900) {
		System.out.println("eight hundred");
	}
	else if(i >= 900 && i < 1000) {
		System.out.println("nine hundred");
	}
	
}

}
