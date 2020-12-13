package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="LauncherTeleOp", group="TeleOp")
@Disabled
public class LauncherTeleOp extends OpMode {

    LauncherMethodTeleOp launcher = null;
    boolean leftbumper = gamepad1.left_bumper;
    boolean rightbumper = gamepad1.right_bumper;

    boolean buttonA = gamepad1.a;
    boolean buttonB = gamepad1.b;
    boolean buttonX = gamepad1.x;
    boolean buttonY = gamepad1.y;
    float lefttrigger = gamepad1.left_trigger;
    float righttrigger = gamepad1.right_trigger;
    double power = 1;
    @Override
    public void init() {
        launcher = new LauncherMethodTeleOp();
    }

    @Override
    public void loop() {

        power = launcher.launcherpower (  power,  buttonA,  buttonB,  buttonX,  buttonY);
        launcher.ejectangle( lefttrigger,  righttrigger);

         if (rightbumper) {
            launcher.Eject(power);
        }
    }
}

