package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class IntakeMethodTeleOp  {
    public DcMotor motorintake1;
    public DcMotor motorintake2;
    public DcMotor motorintake3;
    /**MAYBE ANOTHER MOTOR NO CLUE**/
    public void intakeMotors(HardwareMap hwm) {
        motorintake1 = hwm.get(DcMotor.class, "motorintake1");
        motorintake2 = hwm.get(DcMotor.class, "motorintake2");
        motorintake3 = hwm.get(DcMotor.class, "motorintake3");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }

    public void intake (boolean full, boolean leftbumper, boolean rightbumper) {
        if (leftbumper == true && full == false) {
            motorintake1.setPower(1);
            motorintake2.setPower(1);
            motorintake3.setPower(1);
        }

        else if (rightbumper == true) {
            motorintake1.setPower(-1);
            motorintake2.setPower(-1);
            motorintake3.setPower(-1);
        }
        else {
            motorintake1.setPower(0);
            motorintake2.setPower(0);
            motorintake3.setPower(0);
        }
    }


    public static void main (String [] args) {

}
}