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
        launcher.ejectAngle(gamepad2.right_stick_y);
        launcher.setMaxPower(gamepad2.dpad_up, gamepad2.dpad_down);
        launcher.eject(gamepad2.b);
        if(gamepad2.a) {
            launcher.feed();
        }
        launcher.motorfeed.setPower(gamepad2.left_stick_x);
    }
}

