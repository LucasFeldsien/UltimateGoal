package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class Test extends LinearOpMode {
    HardwareTest htest = new HardwareTest(hardwareMap);


    @Override
    public void runOpMode() throws InterruptedException {
        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
      //  htest.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Resetting Encoders");    //
        telemetry.update();
        HardwareNames names = new HardwareNames();



        names.drivefr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        names.drivefl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        names.drivebr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        names.drivebl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        // Send telemetry message to indicate successful Encoder reset
        telemetry.addData("Path0",  "Starting at %7d :%7d");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();



 //       htest.


    }
}
