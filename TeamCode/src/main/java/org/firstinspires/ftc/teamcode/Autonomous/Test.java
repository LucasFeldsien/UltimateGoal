package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

@TeleOp(name="bttessst", group="TeleOp")
//@Disabled
public class Test extends LinearOpMode {

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
        AutoLauncher launcher = new AutoLauncher(hardwareMap);
        AutoDriveTrain drive = new AutoDriveTrain(hardwareMap);
        AutoGrabber grabb = new AutoGrabber(hardwareMap);

        // Send telemetry message to indicate successful Encoder reset
        telemetry.addData("Path0",  "Starting at %7d :%7d");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        drive.autoStrafe(.2);

 //       htest.


    }
}
