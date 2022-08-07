package com.andreidodu.qm.commands.common.association;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.common.AssociationCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandUpdateAssociationCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String childCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String orderStr = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		Integer order = orderStr == null ? 0 : Integer.parseInt(orderStr);

		AssociationInsert dto = this.getService().updateAssociation(new AssociationInsert(parentCode, childCode, order));
		System.out.println("==> Updated: [" + dto + "]");
	}

	protected abstract AssociationCommonService<AssociationInsert, DTOType> getService();
}
