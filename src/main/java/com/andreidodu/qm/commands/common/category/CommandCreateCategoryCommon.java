package com.andreidodu.qm.commands.common.category;

import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.CategoryInsert;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;
import com.andreidodu.qm.util.QuestionnaireUtil;

public abstract class CommandCreateCategoryCommon<DTOType> {

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Creation selected");
		String title = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String help = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));

		CategoryInsert groupInsert = new CategoryInsert(QuestionnaireUtil.generateRandomString(10), title, help, languageCode);
		DTOType group = this.getService().create(groupInsert);
		System.out.println("==> Created: [" + group + "]");
	}

	protected abstract CategoryCommonService<DTOType> getService();
}
