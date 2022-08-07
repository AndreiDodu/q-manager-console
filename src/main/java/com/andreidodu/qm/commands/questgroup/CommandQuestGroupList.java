package com.andreidodu.qm.commands.questgroup;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.QuestionnaireGroupService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestGroupList implements Command {

	private static final String COMMAND = "questgroupList";

	@Autowired
	private QuestionnaireGroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Questionnaire-Group list all");
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		List<AssociationInsert> list = this.service.getAssociationAll(parentCode);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

}
