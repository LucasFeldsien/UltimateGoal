package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="bttessst", group="TeleOp")
//@Disabled
public class blueStart1 extends LinearOpMode {

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

        drive.autoDriveStraight(80);
        drive.autoStrafe(50);
        launcher.drawbridge(-400);
        launcher.eject(3);
        drive.autoDriveStraight(80);
        drive.autoStrafe(-50);
        drive.autoPivotTurn(-90);
        grabb.lifterDown();
        grabb.grabberOpen();
        drive.autoDriveStraight(-20);
        drive.autoPivotTurn(-90);
        drive.autoDriveStraight(80);


    }
}
