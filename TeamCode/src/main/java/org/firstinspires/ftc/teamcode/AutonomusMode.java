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
        robot.frontleftwheel.setPower(speed);
        robot.backleftwheel.setPower(speed);
        robot.frontrightwheel.setPower(speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movebackward(int time, int speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backleftwheel.setPower(-speed);
        robot.frontrightwheel.setPower(-speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveleft(int time, int speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backleftwheel.setPower(speed);
        robot.frontrightwheel.setPower(speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveright(int time, int speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backleftwheel.setPower(-speed);
        robot.frontrightwheel.setPower(-speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupright(int time, int speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupleft(int time, int speed) {
        robot.frontrightwheel.setPower(speed);
        robot.backleftwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownright(int time, int speed) {
        robot.frontrightwheel.setPower(-speed);
        robot.backleftwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownleft(int time, int speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnright(int time, int speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backleftwheel.setPower(speed);
        robot.frontrightwheel.setPower(-speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnleft(int time, int speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backleftwheel.setPower(-speed);
        robot.frontrightwheel.setPower(speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status","Ready to run");
        telemetry.update();

        waitForStart();

        // Code goes here.
        moveforward(2,1);
        moveleft(4,1);
        moveright(2,1);
        movebackward(2,1);

        telemetry.addData("Status", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
