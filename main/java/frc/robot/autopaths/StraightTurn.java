/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.autopaths;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Add your docs here.
 */
public class StraightTurn extends CommandGroup {

    public StraightTurn(){
    {
        addSequential(new Straight());
        addSequential(new Turn());

        addSequential(new Straight());
        addSequential(new Turn());

        addSequential(new Straight());
        addSequential(new Turn());

        addSequential(new Straight());
        addSequential(new Turn());

        addSequential(new Turn());
        addSequential(new Straight());

        addSequential(new LeftTurn());
        addSequential(new Straight());

        addSequential(new LeftTurn());
        addSequential(new Straight());

        addSequential(new LeftTurn());
        addSequential(new Straight());
        addSequential(new Turn());
        addSequential(new Turn());
        
   
    }
    
}


}
