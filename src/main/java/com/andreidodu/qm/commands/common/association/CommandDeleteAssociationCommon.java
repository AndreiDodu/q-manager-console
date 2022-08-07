package com.andreidodu.qm.commands.common.association;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.common.AssociationCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandDeleteAssociationCommon<DTOType>  {
	
	public void execute(Map<Integer, String> commands) {
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String childCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		Boolean result = this.getService().deleteAssociation(parentCode, childCode);
		System.out.println("==> Deletion status: " + result);
	}

	protected abstract AssociationCommonService<AssociationInsert, DTOType> getService();
}
