package com.john.string.toolsfile;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class FileTools {
	public static List<String> getAllStrings(String path, String encoding) {
		try {
			return Files.readAllLines(Paths.get(path), Charset.forName(encoding));
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}
}
