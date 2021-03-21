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
    IntakeStorageGauge led;

    @Override
    public void init() {
        intake = new IntakeMethodTeleOp(hardwareMap);
        led = new IntakeStorageGauge(hardwareMap);
    }
    //
        //drivetrain.driveMotors(HardwareMap);


    @Override
    public void loop() {
        //dont intake >:()
      //  gauge.rings();
        //if (gauge.isyellow2 () == true && gauge.isyellow3 () == true) {
            intake.intake(/*true,*/ gamepad2.left_bumper, gamepad2.right_bumper);
            if(gamepad1.y == true) {
                led.ledstrip.setPosition(.95);
            }
            else {
                led.ledstrip.setPosition(.37);
        }
    }
       // else {
           // intake.intake(false, leftbumper, rightbumper);
        }

    //}
//}


