package com.andreidodu.qm.commands.questgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.association.CommandUpdateAssociationCommon;
import com.andreidodu.qm.dto.QuestionnaireGroup;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.association.QuestionnaireGroupService;
import com.andreidodu.qm.service.common.AssociationCommonService;

@Component
public class CommandQuestGroupUpdate extends CommandUpdateAssociationCommon<QuestionnaireGroup> implements Command {

	private static final String COMMAND = "questionnairegroupUpdate";

	@Autowired
	private QuestionnaireGroupService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	protected AssociationCommonService<AssociationInsert, QuestionnaireGroup> getService() {
		return this.service;
	}

}
