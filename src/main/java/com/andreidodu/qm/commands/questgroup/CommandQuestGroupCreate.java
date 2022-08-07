package com.andreidodu.qm.commands.questgroup;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.QuestionnaireGroupService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestGroupCreate implements Command {

	private static final String COMMAND = "questgroupCreate";

	@Autowired
	private QuestionnaireGroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire-Group creation selected");
		String questionnaireCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String groupCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String orderStr = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		Integer order = orderStr==null ? 0 : Integer.parseInt(orderStr);

		AssociationInsert associationInsert = new AssociationInsert(questionnaireCode, groupCode, order);
		AssociationInsert dtoInserted = this.service.createAssociation(associationInsert);
		System.out.println("==> Questionnaire-Group association created: [" + dtoInserted + "]");
	}

}
