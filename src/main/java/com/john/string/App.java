package com.john.string;

import com.john.string.actions.TextAction;
import com.john.string.actions.exception.TextActionException;
import com.john.string.io.exceptions.ReadingException;
import com.john.string.parse.exception.ParsingException;
import com.john.string.prepare.action.Action;
import com.john.string.prepare.action.DeleteEmptyLinesAction;
import com.john.string.prepare.action.ReplaceAction;
import com.john.string.prepare.action.TrimEachLineAction;
import com.john.string.prepare.exeption.PreparingException;
import com.john.string.task.*;
import com.john.string.task.enums.SortDirection;

import java.util.Arrays;

public class App {

	private static final int FILE_PARAM = 0;
	private static final int CHAR_PARAM = 1;

	public static void main(String[] argsCLOSE) throws TextActionException, ReadingException, PreparingException, ParsingException { // TODO удалить тровсы и переработать их
        String[] args = {"F:\\text.txt","windows-1251"};

		if (args.length != 2) {
			throw new IllegalArgumentException("Specify language, encoding and input file name.\n"
					+ "Example:\n" + ">: java -jar tp.jar \"lorem.txt\" \"utf-8\"");

		}

		String pathParam = args[FILE_PARAM];
		String charParam = args[CHAR_PARAM];

		System.out.println(pathParam);

		TextAction textAction = new TextAction(pathParam, charParam,
				Arrays.<Task>asList(new Task9_13("а", SortDirection.INCREASE)),
				Arrays.<Action>asList(
						new ReplaceAction("[\\s]{2,}", " "),
						new TrimEachLineAction(),
						new DeleteEmptyLinesAction()
				));

		textAction.execute();
	}
}
