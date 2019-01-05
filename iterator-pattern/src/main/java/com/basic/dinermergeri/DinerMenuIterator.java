package com.basic.dinermergeri;

import java.util.Iterator;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/5.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItem;

    int position=0;

    public DinerMenuIterator(MenuItem[] menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < menuItem.length && menuItem[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.menuItem[position];
        position++;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (menuItem[position-1] != null) {
            for (int i = position-1; i < (menuItem.length-1); i++) {
                menuItem[i] = menuItem[i+1];
            }
            menuItem[menuItem.length-1] = null;
        }
    }
}
