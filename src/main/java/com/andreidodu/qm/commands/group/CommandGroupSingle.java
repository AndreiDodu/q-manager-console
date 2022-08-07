package com.andreidodu.qm.commands.group;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.GroupInsert;
import com.andreidodu.qm.service.category.GroupService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandGroupSingle implements Command {

	private static final String COMMAND = "groupSingle";

	@Autowired
	private GroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Group by code");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		GroupInsert item = this.service.getByCode(code, languageCode);
		System.out.println(item);
	}

}
