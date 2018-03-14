package com.test.jsonparser;

import java.util.List;

public class Worktables{
	private List<WorktableItem> worktable;

	public void setWorktable(List<WorktableItem> worktable){
		this.worktable = worktable;
	}

	public List<WorktableItem> getWorktable(){
		return worktable;
	}

	@Override
 	public String toString(){
		return 
			"Worktables{" + 
			"worktable = '" + worktable + '\'' + 
			"}";
		}
}