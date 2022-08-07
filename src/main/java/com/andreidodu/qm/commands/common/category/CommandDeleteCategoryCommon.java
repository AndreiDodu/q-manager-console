package com.andreidodu.qm.commands.common.category;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandDeleteCategoryCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Deletion selected");
		String groupCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		Boolean result = this.getService().delete(groupCode);
		System.out.println("==> Deletion status: " + result);
	}

	protected abstract CategoryCommonService<DTOType> getService();
}
