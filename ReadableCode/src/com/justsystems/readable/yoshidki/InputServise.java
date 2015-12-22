package com.justsystems.readable.yoshidki;

import java.util.List;

/**
 * 文字列を読み取るサービス
 * 
 * @author yoshidki
 * 
 */
public interface InputServise {
	/**
	 * 文字列を読み取って返す
	 * 
	 * @return
	 */
	public String read();
	
	/**
	 * 文字列を読み取って返す。
	 * １行につき１つのエントリとする。
	 * 
	 * @return 読み取った文字列のリスト。
	 */
	public List<String> readList();
}
