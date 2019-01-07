package com.basic.djview;

import com.basic.djview.controller.ControllerInterface;
import com.basic.djview.controller.HeartController;
import com.basic.djview.model.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
