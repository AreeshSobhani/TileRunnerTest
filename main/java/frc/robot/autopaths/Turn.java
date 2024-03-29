package frc.robot.autopaths;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 * Add your docs here.
 */
public class Turn extends Command {

    private boolean completed;
    private double starttime;

    public void initialize() {
        starttime = Timer.getFPGATimestamp();
    }
    public void execute() {
        if(Timer.getFPGATimestamp() - starttime <= 0.76
        ){
            Robot.drivetrain.leftMaster.set(-0.5);
            Robot.drivetrain.rightMaster.set(-0.5);
        }else {
            Robot.drivetrain.leftMaster.set(0);
            Robot.drivetrain.rightMaster.set(0);
            completed = true;
        }
    }
    
    @Override
    protected boolean isFinished() {
        return completed;
    }

}
