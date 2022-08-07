package com.andreidodu.qm.commands.groupsect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.association.CommandCreateAssociationCommon;
import com.andreidodu.qm.dto.GroupSection;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.association.GroupSectionService;
import com.andreidodu.qm.service.common.AssociationCommonService;

@Component
public class CommandGroupSectionCreate extends CommandCreateAssociationCommon<GroupSection> implements Command {

	protected static final String COMMAND = "groupsectionCreate";

	@Autowired
	protected GroupSectionService service;

	public String getCommand() {
		return COMMAND;
	}

	protected AssociationCommonService<AssociationInsert, GroupSection> getService() {
		return service;
	}

}
