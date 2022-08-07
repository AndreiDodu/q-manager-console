package com.andreidodu.qm.commands.question;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.service.QuestionService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionDelete implements Command {

	private static final String COMMAND = "questionDelete";

	@Autowired
	private QuestionService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	protected QuestionService getService() {
		return this.service;
	}

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Deletion selected");
		String questionCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		Boolean result = this.getService().delete(questionCode);
		System.out.println("==> Deletion status: " + result);
	}

}
