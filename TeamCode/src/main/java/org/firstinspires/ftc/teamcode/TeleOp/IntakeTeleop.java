package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="IntakeTeleOp", group="TeleOp")
//@Disabled
public class IntakeTeleop extends OpMode {
    boolean leftbumper;
    boolean rightbumper;

    IntakeMethodTeleOp intake = null;
    double power = 1;
    @Override
    public void init() {
        intake = new IntakeMethodTeleOp();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
       if ( leftbumper || rightbumper) {
           intake.intake(leftbumper, rightbumper);
        }

    }
}

