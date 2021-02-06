package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.Position;

@Autonomous(name="AutonomusMode", group="Robot")
//@Disabled
public class AutonomusMode extends LinearOpMode implements AutonomusInterface {

    HardwareMap             robot = new HardwareMap();
    private ElapsedTime     runtime = new ElapsedTime();
    public double Ticks_Per_Inch_lateral = 43.477;
    public double Portion_of_Speed;
    @Override
    public void moveforward( double speed, double targetDistance) {
        double targetTicks = targetDistance * Ticks_Per_Inch_lateral;
        robot.frontrightwheel.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.frontrightwheel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        while (robot.frontrightwheel.getCurrentPosition() < targetTicks){
            if (robot.frontrightwheel.getCurrentPosition()-targetTicks > 100){
                Portion_of_Speed = 1;
            }
            else if (robot.frontrightwheel.getCurrentPosition()-targetTicks < 100){
                Portion_of_Speed = robot.frontrightwheel.getCurrentPosition() - targetTicks *.01;
            }
        robot.frontrightwheel.setPower(Portion_of_Speed*.97*speed);
        robot.frontleftwheel.setPower(Portion_of_Speed*speed);
        robot.backrightwheel.setPower(Portion_of_Speed*.959*speed);
        robot.backleftwheel.setPower(Portion_of_Speed*.975*speed);}
       // while (robot.frontrightwheel.getCurrentPosition() < targetTicks){
       //0u }

        //runtime.reset();
        //while (opModeIsActive() && (runtime.seconds() < time)) {

        //}
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
        robot.frontrightwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.frontleftwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.backrightwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.backleftwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void movebackward( double speed, double targetDistance) {
        double targetTicks = targetDistance * -Ticks_Per_Inch_lateral;
        robot.frontrightwheel.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.frontrightwheel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        while (robot.frontrightwheel.getCurrentPosition() < targetTicks){
            if (robot.frontrightwheel.getCurrentPosition()-targetTicks > 100){
                Portion_of_Speed = 1;
            }
            else if (robot.frontrightwheel.getCurrentPosition()-targetTicks < 100){
                Portion_of_Speed = robot.frontrightwheel.getCurrentPosition() - targetTicks *.01;
            }
            robot.frontrightwheel.setPower(Portion_of_Speed*.97*-speed);
            robot.frontleftwheel.setPower(Portion_of_Speed*-speed);
            robot.backrightwheel.setPower(Portion_of_Speed*.959*-speed);
            robot.backleftwheel.setPower(Portion_of_Speed*.975*-speed);}
        // while (robot.frontrightwheel.getCurrentPosition() < targetTicks){
        //0u }

        //runtime.reset();
        //while (opModeIsActive() && (runtime.seconds() < time)) {

        //}
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
        robot.frontrightwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.frontleftwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.backrightwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        robot.backleftwheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    @Override
    public void moveleft(double time, double speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backleftwheel.setPower(speed);
        robot.frontrightwheel.setPower(speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void moveright(double time, double speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backleftwheel.setPower(-speed);
        robot.frontrightwheel.setPower(-speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void moveupright(double time, double speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void moveupleft(double time, double speed) {
        robot.frontrightwheel.setPower(speed);
        robot.backleftwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void movedownright(double time, double speed) {
        robot.frontrightwheel.setPower(-speed);
        robot.backleftwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void movedownleft(double time, double speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void turnright(double time, double speed) {
        robot.frontleftwheel.setPower(speed);
        robot.backleftwheel.setPower(speed);
        robot.frontrightwheel.setPower(-speed);
        robot.backrightwheel.setPower(-speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }

    @Override
    public void turnleft(double time, double speed) {
        robot.frontleftwheel.setPower(-speed);
        robot.backleftwheel.setPower(-speed);
        robot.frontrightwheel.setPower(speed);
        robot.backrightwheel.setPower(speed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
        robot.frontleftwheel.setPower(0);
        robot.frontrightwheel.setPower(0);
        robot.backleftwheel.setPower(0);
        robot.backrightwheel.setPower(0);
    }
    @Override
    public void liftup(double time, double speed) {
        robot.lift.setPower(-speed);
        while (opModeIsActive() && (runtime.seconds() <time)) {}
    }

    @Override
    public void liftdown(double time, double speed) {
        robot.lift.setPower(speed);
        speed = -speed;
        while (opModeIsActive() && (runtime.seconds() <time)) {}
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




        moveforward(.5,12);

        // Code goes here.
       // moveforward(1,.5);
        //moveleft(1,.38);
        //moveright(1,.25);
        //movebackward(1,.25);
        //turnleft(1,0.25);
        //turnright(1,.5);
       // moveforward(1,.25 );
        //liftup( .5,.5);
        //controltray(150);
        //controltray(120);
       // liftdown(.4, 1);
          /*  telemetry.addData("checking first angle", robot.lastAngles.firstAngle);
            telemetry.addData("checking second angle", robot.lastAngles.secondAngle);
            telemetry.addData("checking third angle", robot.lastAngles.thirdAngle);
            telemetry.update();
            sleep(2000);
        telemetry.addData("checking first angle", robot.lastAngles.firstAngle);
        telemetry.addData("checking second angle", robot.lastAngles.secondAngle);
        telemetry.addData("checking third angle", robot.lastAngles.thirdAngle);*/
            telemetry.addData("Status", "Complete");
            telemetry.update();

        sleep(1000);
    }
}
