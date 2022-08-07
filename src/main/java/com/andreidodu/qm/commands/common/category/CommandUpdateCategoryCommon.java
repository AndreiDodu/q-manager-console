package com.andreidodu.qm.commands.common.category;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.CategoryInsert;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandUpdateCategoryCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Updating selected");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String title = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String help = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG3_COMMAND));
		CategoryInsert insertDTO = new CategoryInsert(code, title, help, languageCode);
		CategoryInsert dto = this.getService().update(insertDTO);
		System.out.println("==> Updated: [" + dto + "]");
	}

	protected abstract CategoryCommonService<DTOType> getService();

}
