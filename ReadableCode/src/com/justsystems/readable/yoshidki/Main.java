package com.justsystems.readable.yoshidki;

import java.util.List;

public class Main {
	/** レシピタイトルを読み取るファイルパス */
	private static final String RECIPE_TITLE_FILE_PATH = "recipe-data.txt";

	public static void main(String args[]) {
		// ファイルから文字列を読み取る
		InputServise inputService = new FileInputServise(RECIPE_TITLE_FILE_PATH);
		
		//spec3の動作は使用しないのでコメントアウト
		//String recipeTitle = inputService.read();
		List<String> recipeTitles = inputService.readList();
		if (recipeTitles == null) {
			System.out.print("error:cant read recipe title.");
			return;
		}
		// OutputServiceを生成して出力させる
		OutputService outputService = new SystemOutputService();
		//spec3の動作は使用しないのでコメントアウト
		//outputService.output(recipeTitle);
		outputService.output(recipeTitles);
	}
}
