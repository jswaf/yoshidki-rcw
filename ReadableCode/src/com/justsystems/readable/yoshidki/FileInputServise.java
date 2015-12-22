package com.justsystems.readable.yoshidki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import java.util.List;
import java.util.ArrayList;

/**
 * ファイルから文字列を読み取って返すクラス
 * 
 * @author yoshidki
 *
 */
public class FileInputServise implements InputServise {
	/** 読み取るファイルのパス */
	private final String filePath;

	public FileInputServise(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * ファイルから一行目を読み取って返す。<br>
	 * 失敗した場合はログ出力してnullを返す
	 */
	@Override
	public String read() {
		List<String> list = readList();
		//１行読めたときだけそれを返す
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	
	/**
	 * 文字列を読み取って返す。
	 * １行につき１つのエントリとする。
	 * 失敗した場合はログ出力してnullを返す。
	 * 
	 * @return 読み取った文字列のリスト。ただし失敗した場合はnull。
	 */
	@Override
	public List<String> readList() {
		if (filePath == null) {
			System.out.println("error:filePath is null.");
			return null;
		}
		File file = new File(filePath);
		if (!file.isFile()) {
			System.out.println("error:" + filePath + " isn't File");
			return null;
		}
		
		List<String> list = new ArrayList<String>();
		
		try (LineNumberReader lrn = new LineNumberReader(new InputStreamReader(new FileInputStream(file)));) {
			String line = null;
			while ((line = lrn.readLine()) != null) {
				list.add(line);
			}
			return list;
		} catch (IOException ex) {
			ex.printStackTrace();
			for (Throwable t : ex.getSuppressed()) {
				t.printStackTrace();
			}
		}
		return null;
	}
}
