package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="LauncherTeleOp", group="TeleOp")
@Disabled
public class LauncherTeleOp extends OpMode {

    LauncherMethodTeleOp launcher;

    @Override
    public void init() {
        launcher = new LauncherMethodTeleOp(hardwareMap);
    }
    @Override
    public void loop() {
        launcher.ejectAngle(gamepad2.left_trigger, gamepad2.right_trigger);
        launcher.feed(gamepad2.b);
        if (gamepad2.right_bumper) {
            launcher.Eject(gamepad2.x);
        }

    }
}

