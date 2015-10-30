package com.john.string.actions;

import java.util.List;

import com.john.string.actions.exception.TextActionException;
import com.john.string.io.FileReader;
import com.john.string.io.ReadingFromFileSystem;
import com.john.string.io.exceptions.ReadingException;
import com.john.string.parse.Parser;
import com.john.string.parse.SimpleParser;
import com.john.string.parse.exception.ParsingException;
import com.john.string.prepare.DefaultPreparer;
import com.john.string.prepare.Preparer;
import com.john.string.prepare.action.Action;
import com.john.string.prepare.exeption.PreparingException;
import com.john.string.task.Task;
import com.john.string.text.Text;

public class TextAction {
	//
	// TODO: Подумать надо объединением этих полей в единую сущность.
	//
	private FileReader reader;
	private Preparer preparer;
	private Parser parser;

	private List<Action> asPreparer;
	private List<Task> asTask;

	public TextAction(String pathParam, String charParam, List<Task> asTask, List<Action> asPreparer) {
		this.reader = new ReadingFromFileSystem(pathParam, charParam);
		this.preparer = new DefaultPreparer();
		this.parser = new SimpleParser();
		this.asPreparer = asPreparer;
		this.asTask = asTask;
	}

	public void execute() throws TextActionException, ReadingException, PreparingException, ParsingException {
		try {
			List<String> lines = reader.readAllLines();
			lines = preparer.prepare(lines, asPreparer);
			Text text = parser.parse(lines);

			if (!asTask.isEmpty()) {
				for (Task task : asTask) {
					task.run(text);
				}
			}
		} catch (ReadingException e) {
			throw new TextActionException("Reading error.", e);
		} catch (PreparingException e) {
			throw new TextActionException("Preparing error.", e);
		} catch (ParsingException e) {
			throw new TextActionException("Parsing error.", e);
		}
	}

}
