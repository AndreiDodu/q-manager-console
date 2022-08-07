package com.andreidodu.qm.commands.section;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.commands.common.category.CommandSingleCategoryCommon;
import com.andreidodu.qm.dto.Section;
import com.andreidodu.qm.service.category.SectionService;
import com.andreidodu.qm.service.common.CategoryCommonService;

@Component
public class CommandSectionSingle extends CommandSingleCategoryCommon<Section> implements Command {

	private static final String COMMAND = "sectionSingle";

	@Autowired
	private SectionService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	@Override
	protected CategoryCommonService<Section> getService() {
		return this.service;
	}

}
