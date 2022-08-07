package com.andreidodu.qm.commands.question;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.QuestionInsert;
import com.andreidodu.qm.service.QuestionService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionList implements Command {

	private static final String COMMAND = "questionList";

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
		System.out.println("==> List all");
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		List<QuestionInsert> list = this.getService().getAll(languageCode);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

}
