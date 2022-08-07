package com.andreidodu.qm.commands.group;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.category.CommandUpdateCategoryCommon;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.Group;
import com.andreidodu.qm.dto.input.GroupInsert;
import com.andreidodu.qm.service.category.GroupService;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandGroupUpdate extends CommandUpdateCategoryCommon<Group> implements Command {

	private static final String COMMAND = "groupUpdate";

	@Autowired
	private GroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	protected CategoryCommonService<Group> getService() {
		return this.service;
	}

}
