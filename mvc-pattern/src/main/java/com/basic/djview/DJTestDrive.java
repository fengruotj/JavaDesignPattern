package com.basic.djview;

import com.basic.djview.controller.BeatController;
import com.basic.djview.controller.ControllerInterface;
import com.basic.djview.model.BeatModel;
import com.basic.djview.model.BeatModelInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
