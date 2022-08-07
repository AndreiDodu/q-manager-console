package com.andreidodu.qm.commands.groupsect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.association.CommandListAssociationCommon;
import com.andreidodu.qm.dto.GroupSection;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.association.GroupSectionService;
import com.andreidodu.qm.service.common.AssociationCommonService;

@Component
public class CommandGroupSectionList  extends CommandListAssociationCommon<GroupSection> implements Command {

	protected static final String COMMAND = "groupsectionList";

	@Autowired
	protected GroupSectionService service;

	public String getCommand() {
		return COMMAND;
	}

	protected AssociationCommonService<AssociationInsert, GroupSection> getService() {
		return service;
	}

}
