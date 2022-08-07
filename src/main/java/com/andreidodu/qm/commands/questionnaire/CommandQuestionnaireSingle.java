package com.andreidodu.qm.commands.questionnaire;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.QuestionnaireInsert;
import com.andreidodu.qm.service.category.QuestionnaireService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionnaireSingle implements Command {

	private static final String COMMAND = "questionnaireSingle";

	@Autowired
	private QuestionnaireService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire by code");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		QuestionnaireInsert item = this.service.getByCode(code, languageCode);
		System.out.println(item);
	}

}
