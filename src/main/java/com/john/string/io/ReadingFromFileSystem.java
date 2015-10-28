package com.john.string.io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import com.john.string.io.exceptions.ReadingException;

public class ReadingFromFileSystem implements FileReader {
	private String pathname;
	private String encoding;

	public ReadingFromFileSystem(String path, String encoding) {
		this.pathname = path;
		this.encoding = encoding;
	}

	@Override
	public List<String> readAllLines() throws ReadingException {
		File file = new File(pathname);

		if (!file.exists()) {
			throw new ReadingException("Specified file '" + pathname + "' does not exist.");
		}

		try {
			return Files.readAllLines(file.toPath(), Charset.forName(encoding));
		} catch (IOException ioe) {
			throw new ReadingException("Error reading file.", ioe);
		}
	}
}
