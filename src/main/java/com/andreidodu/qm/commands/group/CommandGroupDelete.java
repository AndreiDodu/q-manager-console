package com.andreidodu.qm.commands.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.category.CommandDeleteCategoryCommon;
import com.andreidodu.qm.dto.Group;
import com.andreidodu.qm.service.category.GroupService;
import com.andreidodu.qm.service.common.CategoryCommonService;

@Component
public class CommandGroupDelete extends CommandDeleteCategoryCommon<Group> implements Command {

	private static final String COMMAND = "groupDelete";

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
