package com.basic.dinermerger;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/5.
 */
public class DinerMenuIterator implements Iterator {
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
}
