package com.andreidodu.qm.commands.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.qm.commands.Command;
import com.andreidodu.qm.constants.ConsoleConstants;
import com.andreidodu.qm.dto.Pair;
import com.andreidodu.qm.dto.Question;
import com.andreidodu.qm.dto.input.QuestionInsert;
import com.andreidodu.qm.service.QuestionService;
import com.andreidodu.qm.util.ConsoleUtil;

@Component
public class CommandQuestionUpdate implements Command {

	private static final String COMMAND = "questionUpdate";

	@Autowired
	private QuestionService service;

	@Override
	public String getCommand() {
		return COMMAND;
	}

	protected QuestionService getService() {
		return this.service;
	}

	public void execute(Map<Integer, String> commands) {
		System.out.println("==> Updating selected");
		String code = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG0_COMMAND));
		String text = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG1_COMMAND));
		String help = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG2_COMMAND));
		String type = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG3_COMMAND));
		String languageCode = ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG4_COMMAND));
		List<Pair> options = Arrays.asList(ConsoleUtil.processArgument(commands.get(ConsoleConstants.ARG5_COMMAND)).split(";")).stream().map(str -> new Pair("", str)).collect(Collectors.toList());

		QuestionInsert groupInsert = new QuestionInsert(code, text, help, type, languageCode, options);
		Question question = this.getService().update(groupInsert);
		System.out.println("==> Updated: [" + question + "]");
	}

}
