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
public class CommandQuestGroupUpdate implements Command {

	private static final String COMMAND = "questgroupUpdate";

	@Autowired
	private QuestionnaireGroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire updating selected");
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String childCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String parentCode2 = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		String childCode2 = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG3_COMMAND));
		String orderStr = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG4_COMMAND));
		Integer order = orderStr == null ? 0 : Integer.parseInt(orderStr);

		AssociationInsert dto = this.service.updateAssociation(parentCode, childCode, parentCode2, childCode2, order);
		System.out.println("==> Questionnaire updated: [" + dto + "]");
	}

}
