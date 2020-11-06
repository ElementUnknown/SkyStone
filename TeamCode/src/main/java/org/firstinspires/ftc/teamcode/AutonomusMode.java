package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="AutonomusMode", group="Robot")
//@Disabled
public class AutonomusMode extends LinearOpMode implements MotorInterface {

    HardwareMap             robot = new HardwareMap();
    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void moveforward(int time, int speed) {
        robot.frontrightwheel.setPower(speed);
    }

    @Override
    public void movebackward(int time, int speed) {

    }

    @Override
    public void moveleft(int time, int speed) {

    }

    @Override
    public void moveright(int time, int speed) {

    }

    @Override
    public void moveupright(int time, int speed) {

    }

    @Override
    public void moveupleft(int time, int speed) {

    }

    @Override
    public void movedownright(int time, int speed) {

    }

    @Override
    public void movedownleft(int time, int speed) {

    }

    @Override
    public void turnright(int time, int speed) {

    }

    @Override
    public void turnleft(int time, int speed) {

    }

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status","Ready to run");
        telemetry.update();

        waitForStart();

        // Code goes here.

        telemetry.addData("Status", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
