package com.john.string.io;

import java.util.List;

import com.john.string.io.exceptions.ReadingException;

public interface FileReader {
	List<String> readAllLines() throws ReadingException;
}
