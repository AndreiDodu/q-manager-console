package com.andreidodu.qm.commands.questionnaire;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.QuestionnaireInsert;
import com.andreidodu.qm.service.QuestionnaireService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionnaireList implements Command {

	private static final String COMMAND = "questionnaireList";

	@Autowired
	private QuestionnaireService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire list all");
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		List<QuestionnaireInsert> list = this.service.getAll(languageCode);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

}
