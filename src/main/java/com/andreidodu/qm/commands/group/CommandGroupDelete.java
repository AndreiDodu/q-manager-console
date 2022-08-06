package com.andreidodu.qm.commands.group;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.service.GroupService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandGroupDelete implements Command {

	private static final String COMMAND = "groupDelete";

	@Autowired
	private GroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Group deletion selected");
		String groupCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		Boolean result = this.service.delete(groupCode);
		System.out.println("==> Group deletion status: " + result);
	}

}
