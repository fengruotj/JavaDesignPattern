package com.basic.adapter;

import com.basic.ducks.Quackable;

/**
 * locate com.basic.adapter
 * Created by MasterTj on 2019/1/7.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
