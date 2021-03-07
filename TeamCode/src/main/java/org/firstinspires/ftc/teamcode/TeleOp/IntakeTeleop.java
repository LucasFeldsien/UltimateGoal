package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="IntakeTeleOp", group="TeleOp")
//@Disabled
public class IntakeTeleop extends OpMode {


    IntakeMethodTeleOp intake;
    IntakeStorageGauge gauge = null;

    @Override
    public void init() {
        intake = new IntakeMethodTeleOp(hardwareMap);
    }
     //   intake = new IntakeMethodTeleOp();
     //   gauge = new IntakeStorageGauge();
        //drivetrain.driveMotors(HardwareMap);


    @Override
    public void loop() {
        //dont intake >:()
      //  gauge.rings();
        //if (gauge.isyellow2 () == true && gauge.isyellow3 () == true) {
            intake.intake(/*true,*/ gamepad1.left_bumper, gamepad1.right_bumper); }
       // else {
           // intake.intake(false, leftbumper, rightbumper);
        }

    //}
//}


