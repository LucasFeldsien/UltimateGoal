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
    boolean leftbumper = gamepad1.left_bumper;
    boolean rightbumper = gamepad1.right_bumper;
    float lefttrigger = gamepad1.left_trigger;
    float righttrigger = gamepad1.right_trigger;

    @Override
    public void init() {
        launcher = new LauncherMethodTeleOp();
        launcher.launcherMotors(hardwareMap);
    }
    @Override
    public void loop() {

        launcher.ejectAngle( lefttrigger,  righttrigger);

         if (rightbumper) {
            launcher.Eject();
        }
    }
}

