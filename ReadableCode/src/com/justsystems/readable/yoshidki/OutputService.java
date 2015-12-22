package com.justsystems.readable.yoshidki;

import java.util.List;

/**
 * 与えられた文字列を出力するインターフェイス
 * 
 * @author yoshidki
 *
 */
public interface OutputService {
	/**
	 * 引数で与えられた文字列を出力する
	 * 
	 * @param str
	 */
	public void output(String str);
	
	/**
	 * 引数で与えられた文字列のリストを出力する
	 * 
	 * @param list
	 */
	public void output(List<String> list);
}
