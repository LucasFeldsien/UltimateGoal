package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="LauncherTeleOp", group="TeleOp")
@Disabled
class LauncherTeleOp extends OpMode {

    LauncherMethodTeleOp launcher = null;
    double power = 1;
    @Override
    public void init() {
        launcher = new LauncherMethodTeleOp();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {

    }

}

