package com.john.string;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.john.string.actions.TextAction;
import com.john.string.actions.exception.TextActionException;
import com.john.string.io.exceptions.ReadingException;
import com.john.string.parse.exception.ParsingException;
import com.john.string.prepare.action.Action;
import com.john.string.prepare.action.DeleteEmptyLinesAction;
import com.john.string.prepare.action.ReplaceAction;
import com.john.string.prepare.action.TrimEachLineAction;
import com.john.string.prepare.exeption.PreparingException;
import com.john.string.task.Task;
import com.john.string.task.Task1;
import com.john.string.text.Text;

public class App {
	private static final int FILE_PARAM = 0;
	private static final int CHAR_PARAM = 1;

	public static void main(String[] args222222222222222222) throws ReadingException, PreparingException, ParsingException {
		String[] args = { "F:\\text.txt", "windows-1251" };

		if (args.length != 2) {
			throw new IllegalArgumentException("Specify language, encoding and input file name.\n" + "Example:\n"
					+ ">: java -jar tp.jar \"lorem.txt\" \"utf-8\"");
		}

		String pathParam = args[FILE_PARAM];
		String charParam = args[CHAR_PARAM];

		TextAction textAction = new TextAction(pathParam, charParam, 
				Arrays.<Task> asList(
						new Task1()
				), 
				Arrays.<Action> asList(
						new TrimEachLineAction(),
						new DeleteEmptyLinesAction(),
						new ReplaceAction("[\\s]{2,}", " ")
						
				));
		try {
			textAction.executse();
		} catch (TextActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
