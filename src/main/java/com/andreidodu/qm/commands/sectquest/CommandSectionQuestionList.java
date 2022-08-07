package com.andreidodu.qm.commands.sectquest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.association.CommandListAssociationCommon;
import com.andreidodu.qm.dto.SectionQuestion;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.association.SectionQuestionService;
import com.andreidodu.qm.service.common.AssociationCommonService;

@Component
public class CommandSectionQuestionList extends CommandListAssociationCommon<SectionQuestion> implements Command {

	private static final String COMMAND = "sectionquestionList";

	@Autowired
	private SectionQuestionService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	protected AssociationCommonService<AssociationInsert, SectionQuestion> getService() {
		return this.service;
	}

}
