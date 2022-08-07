package com.andreidodu.qm.commands.question;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.QuestionInsert;
import com.andreidodu.qm.service.QuestionService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionSingle implements Command {

	private static final String COMMAND = "questionSingle";

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
		System.out.println("==> Get by code");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		QuestionInsert item = this.getService().getByCode(code, languageCode);
		System.out.println(item);
	}
}
