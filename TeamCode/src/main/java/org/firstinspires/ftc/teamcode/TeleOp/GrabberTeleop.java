package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="GrabberTeleOp", group="TeleOp")
//@Disabled
public class GrabberTeleop extends OpMode {


    GrabberMethodTeleOp grabber;
    boolean dLeft = gamepad1.dpad_left;
    boolean dRight = gamepad1.dpad_right;
    boolean dUp = gamepad1.dpad_up;
    boolean dDown = gamepad1.dpad_down;
    double power = 1;
    @Override
    public void init() {
        grabber = new GrabberMethodTeleOp(hardwareMap);
    }

    @Override
    public void loop() {
        grabber.grabbergrab( dLeft,  dRight);
        grabber.grabberlift( dUp,  dDown);
    }
}

