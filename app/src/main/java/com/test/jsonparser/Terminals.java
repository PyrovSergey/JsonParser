package com.test.jsonparser;

import java.util.List;

public class Terminals{
	private List<TerminalItem> terminal;

	public void setTerminal(List<TerminalItem> terminal){
		this.terminal = terminal;
	}

	public List<TerminalItem> getTerminal(){
		return terminal;
	}

	@Override
 	public String toString(){
		return 
			"Terminals{" + 
			"terminal = '" + terminal + '\'' + 
			"}";
		}
}