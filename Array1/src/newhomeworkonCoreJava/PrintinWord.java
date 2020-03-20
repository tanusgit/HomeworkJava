package newhomeworkonCoreJava;

public class PrintinWord {
public static void main(String[] args) {
	//printten(333);
	print(54);
}



private static void print2(String i) {
	// TODO Auto-generated method stub
	int res = Integer.parseInt(i);
	for(int j =0; j < i.length(); j++) {
		char c = i.charAt(j);
		print((int)c);
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
	else {
		printten(i);
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
	
	

}

}
