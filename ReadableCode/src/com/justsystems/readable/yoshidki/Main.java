package com.justsystems.readable.yoshidki;

public class Main {
	/** レシピタイトルを読み取るファイルパス */
	private static final String RECIPE_TITLE_FILE_PATH = "recipe-data.txt";

	public static void main(String args[]) {
		// ファイルから文字列を読み取る
		InputServise inputService = new FileInputServise(RECIPE_TITLE_FILE_PATH);
		String recipeTitle = inputService.read();
		if (recipeTitle == null) {
			System.out.print("error:cant read recipe title.");
			return;
		}
		// OutputServiceを生成して出力させる
		OutputService outputService = new SystemOutputService();
		outputService.output(recipeTitle);
	}
}
