package com.john.string;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.john.string.text.Text;
import com.john.string.toolsfile.FileTools;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		
		List<String> allStrings = FileTools.getAllStrings("F:\\text.txt","windows-1251");
		
		Text fullText = new Text(allStrings);
//		System.out.println(fullText);
//		System.out.println("------------------------------------");

		// TextTools.textAnaliz(textFromFile);
	}

}
