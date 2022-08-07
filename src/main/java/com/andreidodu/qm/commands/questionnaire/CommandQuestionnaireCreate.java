package com.andreidodu.qm.commands.questionnaire;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.Questionnaire;
import com.andreidodu.qm.dto.input.QuestionnaireInsert;
import com.andreidodu.qm.service.QuestionnaireService;
import com.andreidodu.qm.util.ConsoleUtil;
import com.andreidodu.qm.util.QuestionnaireUtil;

@Component
public class CommandQuestionnaireCreate implements Command {

	private static final String COMMAND = "questionnaireCreate";

	@Autowired
	private QuestionnaireService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire creation selected");
		String title = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String help = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));

		QuestionnaireInsert insertDto = new QuestionnaireInsert(QuestionnaireUtil.generateRandomString(10), title, help, languageCode);
		Questionnaire dto = this.service.create(insertDto);
		System.out.println("==> Questionnaire created: [" + dto + "]");
	}

}
