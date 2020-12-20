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
    IntakeStorageGauge gauge = null;
    double power = 1;
    @Override
    public void init() {
        intake = new IntakeMethodTeleOp();
        gauge = new IntakeStorageGauge();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        //dont intake >:()

       if ( leftbumper || rightbumper) {
           intake.intake(leftbumper, rightbumper);
        }

    }
}

