package com.justsystems.readable.yoshidki;

/**
 * systemの標準出力に出力するOutputService
 * 
 * @author yoshidki
 *
 */
public class SystemOutputService implements OutputService {

	@Override
	public void output(String str) {
		System.out.print(str);
	}

}
