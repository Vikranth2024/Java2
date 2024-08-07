package pkg;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws FileNotFoundException {
		String input="";
		int totalmarks=0;
		ArrayList<String> country = new ArrayList<>();
		ArrayList<String> capital = new ArrayList<>();
		ArrayList<Integer> marks = new ArrayList<>();
		ArrayList<String> response = new ArrayList<>();
		File f1 = new File("capitals.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1 = sc1.nextLine().split(",");
			country.add(arr1[0]);
			capital.add(arr1[1]);
		}
		Scanner sc2 = new Scanner(System.in);
		for(int i=0;i<country.size();i++) {
			System.out.println("What is the capital of "+country.get(i)+"? ");
			input = sc2.nextLine();
			response.add(input);
			if(input.equalsIgnoreCase(capital.get(i))){
				marks.add(10);
			}
			else {
				marks.add(0);
			}
		}
		for(int i=0;i<country.size();i++) {
			totalmarks+=marks.get(i);
			if(!capital.get(i).equalsIgnoreCase(response.get(i))) {
				System.out.println(country.get(i)+" : "+capital.get(i));
			}
		}
		System.out.println("Total marks - "+ totalmarks);
	}
}

