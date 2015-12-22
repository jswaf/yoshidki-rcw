package com.justsystems.readable.yoshidki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

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
		if (filePath == null) {
			System.out.println("error:filePath is null.");
			return null;
		}
		File file = new File(filePath);
		if (!file.isFile()) {
			System.out.println("error:" + filePath + " isn't File");
			return null;
		}
		try (LineNumberReader lrn = new LineNumberReader(new InputStreamReader(new FileInputStream(file)));) {
			return lrn.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
			for (Throwable t : ex.getSuppressed()) {
				t.printStackTrace();
			}
		}
		return null;
	}
}
