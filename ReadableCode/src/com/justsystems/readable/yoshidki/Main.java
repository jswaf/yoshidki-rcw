package com.justsystems.readable.yoshidki;

public class Main {

	/** 出力する文字列 */
	private static final String OMURAISU = "オムライス";

	public static void main(String args[]) {
		// OutputServiceを生成して出力させる
		OutputService outputService = new SystemOutputService();
		outputService.output(OMURAISU);
	}

}
