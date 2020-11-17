package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="AutonomusMode", group="Robot")
//@Disabled
public class AutonomusMode extends LinearOpMode implements AutonomusInterface {

    HardwareMap             robot = new HardwareMap();
    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void moveforward(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movebackward(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveleft(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveright(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupright(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupleft(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontrightwheel.setPower(rspeed);
        robot.backleftwheel.setPower(lspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownright(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontrightwheel.setPower(-rspeed);
        robot.backleftwheel.setPower(-lspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownleft(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnright(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnleft(int time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void controltray(int angle) {
        robot.tray.setPosition(angle);
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
        turnleft(2,0.5);
        turnright(2,0.5);

        telemetry.addData("Status", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
