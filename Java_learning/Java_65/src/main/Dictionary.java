package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {

	Map<String, String> data = new HashMap<String, String>();

	
//	1. Thêm từ (Từ khóa, Ý nghĩa)
	public String addWord(String keyWord, String mean) {
		return this.data.put(keyWord, mean);
	}

//	2. Xóa từ
	public String deleteWord (String keyWord) {
		return this.data.remove(keyWord);
	}

//	3. Tìm ý nghĩa của từ khóa => Tra từ
	public String lookUpWord(String keyWord) {
		String result = this.data.get(keyWord);
		return result;
	}

//	4. In râ danh sách từ khóa
	public void printKeyWordList() {
		Set<String> keyWordList = this.data.keySet();
		System.out.println(Arrays.toString(keyWordList.toArray()));
	}
	
//	5. Lấy số lượng từ khóa
	public int getQuantity () {
		return this.data.size();
	}
//	6. Xóa tất cả các từ khóa.
	public void delete () {
		this.data.clear();
		System.out.println("Đã xoát tất cả các từ khóa !!!");
	}


	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------");
			System.out.println("Look up the English-Vietnamese dictionary:\n"
					+ " 1. Add words (Keyword, Meaning)\n"
					+ "	2. Delete words\n"
					+ "	3. Find the meaning of the keyword => Look up the word\n"
					+ "	4. Print out the keyword list\n"
					+ "	5. Get the number of keywords\n"
					+ "	6. Delete all keywords.\n"
					+ "	0. Exit the program.");
			choose = sc.nextInt();
			sc.nextLine();
			if (choose == 1) {
				System.out.println("Enter keywords: ");
				String keyWord = sc.nextLine();
				System.out.println("Enter meaning: ");
				String meanWord = sc.nextLine();
				dic.addWord(keyWord, meanWord);
				System.out.println("You have entered successfully !!");
			}else if (choose == 2 || choose == 3) {
				System.out.println("Enter the word you want to look up: ");
				String word = sc.nextLine();
				if(choose == 2) {
					dic.deleteWord(word);
					System.out.println("You have removed !!");
				}else {
					System.out.println("Meaning: " + dic.lookUpWord(word));
				}
			} else if (choose == 4) {
				System.out.println("list included: ");
				dic.printKeyWordList();
			}else if (choose == 5) {
				System.out.println("Number Word is: " + dic.getQuantity());
			}else if (choose == 6) {
				dic.delete();
			}
			
		}while (choose != 0);

	}

}
