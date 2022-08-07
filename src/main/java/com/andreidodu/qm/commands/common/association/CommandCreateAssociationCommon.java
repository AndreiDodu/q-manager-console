package com.andreidodu.qm.commands.common.association;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.common.AssociationCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandCreateAssociationCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		String questionnaireCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String groupCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String orderStr = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		Integer order = orderStr == null ? 0 : Integer.parseInt(orderStr);
		AssociationInsert associationInsert = new AssociationInsert(questionnaireCode, groupCode, order);
		AssociationInsert dtoInserted = this.getService().createAssociation(associationInsert);
		System.out.println("==> association created: [" + dtoInserted + "]");
	}

	protected abstract AssociationCommonService<AssociationInsert, DTOType> getService();
}
