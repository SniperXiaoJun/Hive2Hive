package org.hive2hive.client.menu.basic;

import org.hive2hive.client.console.ConsoleMenu;
import org.hive2hive.client.console.PreconditionConsoleMenuItem;

public class BasicMenu extends ConsoleMenu {

	public PreconditionConsoleMenuItem connectionMenu;
	
	@Override
	protected void createItems() {
		connectionMenu = new PreconditionConsoleMenuItem("Connect") {
			
			@Override
			protected void execute() throws Exception {
				new ConnectionMenu().open();
			}
		};

	}
	
	@Override
	protected void addMenuItems() {
		add(connectionMenu);
	}

	@Override
	protected String getInstruction() {
		return "Choose action:";
	}

}
