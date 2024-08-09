package pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class V2 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String>years1 = new ArrayList<>();
		ArrayList<String>event = new ArrayList<>();
		ArrayList<String>names = new ArrayList<>();
		ArrayList<String>years2 = new ArrayList<>();
		ArrayList<String>winners1 = new ArrayList<>();
		Set<String>set1 = new LinkedHashSet<>();
		
		File f1 = new File("olympics.csv");
		Scanner sc1 = new Scanner(f1);
		sc1.nextLine();
		while(sc1.hasNext()) {
			String[] arr1 = sc1.nextLine().split(",");
			String s1 = arr1[0].substring(0,4);
			years1.add(s1);
			event.add(arr1[7]);
			names.add(arr1[4]+" "+arr1[5]);
		}
		set1.addAll(years1);
		years2.addAll(set1);
		for(int i=0;i<names.size();i++) {
			if(years2.get(0).equals(years1.get(i))) {
				winners1.add(names.get(i));
			}
		}
		System.out.println(winners1);

	}

}
