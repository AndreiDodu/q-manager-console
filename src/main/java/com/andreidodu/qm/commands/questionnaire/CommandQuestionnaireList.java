package com.andreidodu.qm.commands.questionnaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.category.CommandListCategoryCommon;
import com.andreidodu.qm.dto.Questionnaire;
import com.andreidodu.qm.service.category.QuestionnaireService;
import com.andreidodu.qm.service.common.CategoryCommonService;

@Component
public class CommandQuestionnaireList extends CommandListCategoryCommon<Questionnaire> implements Command {

	private static final String COMMAND = "questionnaireList";

	@Autowired
	private QuestionnaireService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	protected CategoryCommonService<Questionnaire> getService() {
		return this.service;
	}

}
