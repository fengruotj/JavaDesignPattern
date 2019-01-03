package com.basic.undo;

/**
 * locate com.basic.undo
 * Created by MasterTj on 2019/1/3.
 */
public interface Command {
    public void execute();
    public void undo();
}
