package com.andreidodu.qm.commands.common.association;

import java.util.List;
import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.AssociationInsert;
import com.andreidodu.qm.service.common.AssociationCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandListAssociationCommon<DTOType>  {

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Group-Section list all");
		String parentCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		List<AssociationInsert> list = this.getService().getAssociationAll(parentCode);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

	protected abstract AssociationCommonService<AssociationInsert, DTOType> getService();
}
