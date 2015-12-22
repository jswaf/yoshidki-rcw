package com.justsystems.readable.yoshidki;

import java.util.List;
import java.util.Iterator;

/**
 * systemの標準出力に出力するOutputService
 * 
 * @author yoshidki
 *
 */
public class SystemOutputService implements OutputService {

	@Override
	public void output(String str) {
		System.out.println(str);
	}

	@Override
	public void output(List<String> list) {
		if (list == null) {
			output((String)null);
			return;
		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			output(iterator.next());
		}
	}

}
