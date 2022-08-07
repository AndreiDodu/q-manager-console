package com.andreidodu.qm.commands.common.category;

import java.util.List;
import java.util.Map;

import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.input.common.CategoryInsert;
import com.andreidodu.qm.service.common.CategoryCommonService;
import com.andreidodu.qm.util.ConsoleUtil;

public abstract class CommandListCategoryCommon<DTOType> {
	
	public void execute(Map<Integer, String> commands) {
		System.out.println("==> List all");
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		List<CategoryInsert> list = this.getService().getAll(languageCode);
		list.forEach(item -> {
			System.out.println(item);
		});
	}

	protected abstract CategoryCommonService<DTOType> getService();
}
