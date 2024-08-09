package pkg;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
public class V1 {

	public static void main(String[] args)throws IOException {
		File f1 = new File("olympics.csv");
		Scanner sc1 = new Scanner(f1);
		ArrayList<String>years1 = new ArrayList<>();
		String s1 = "",s2 = "";
		s1 = sc1.nextLine();
		for(int i=0;i<20000;i++) {
			s1 = sc1.nextLine();
			s2 = s1.substring(0,4);
			years1.add(s2);
		}
		Set<String> set1 = new HashSet<>(years1);
		ArrayList<String>years2 = new ArrayList<>(set1);
		Collections.sort(years2);
		System.out.println(years2);
	}

}
