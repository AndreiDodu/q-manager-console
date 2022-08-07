package com.andreidodu.qm.commands.common.category;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.CategoryInsert;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandSingleCategoryCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Get by code");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		CategoryInsert item = this.getService().getByCode(code, languageCode);
		System.out.println(item);
	}

	protected abstract CategoryCommonService<DTOType> getService();
}
