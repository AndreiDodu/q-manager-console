package com.andreidodu.qm.commands.questgroup;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.service.QuestionnaireGroupService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestGroupDelete implements Command {

	private static final String COMMAND = "questgroupDelete";

	@Autowired
	private QuestionnaireGroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire-Group deletion selected");
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String childCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		Boolean result = this.service.deleteAssociation(parentCode, childCode);
		System.out.println("==> Questionnaire-Group deletion status: " + result);
	}

}
