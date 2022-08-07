package com.andreidodu.qm.commands.section;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.service.category.SectionService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandSectionDelete implements Command {

	private static final String COMMAND = "SectionDelete";

	@Autowired
	private SectionService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Section deletion selected");
		String groupCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		Boolean result = this.service.delete(groupCode);
		System.out.println("==> Section deletion status: " + result);
	}

}
