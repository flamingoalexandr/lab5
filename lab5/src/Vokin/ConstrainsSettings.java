package Vokin;

import java.awt.*;

class ConstrainsSettings extends GridBagConstraints {
    static int counterForTextboxes = 3;
    protected static GridBagConstraints constrainsForTitle(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(5, 15,20,15);
        constraints.gridx=0;
        constraints.gridy=0;
        return constraints;
    }
    protected static GridBagConstraints constrainsForMainTextbox(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,0,15);
        constraints.gridx=0;
        constraints.gridy=1;
        return constraints;
    }
    protected static GridBagConstraints constrainsForMainButton(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(5, 15,30,15);
        constraints.gridx=0;
        constraints.gridy=2;
        return constraints;
    }
    protected static GridBagConstraints constrainsForTextboxes(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,0,15);
        constraints.gridx=0;
        constraints.gridy=counterForTextboxes;
        counterForTextboxes++;
        return constraints;
    }
    protected static GridBagConstraints constrainsForTextboxesComments(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,25,15);
        constraints.gridx=0;
        constraints.gridy=counterForTextboxes;
        counterForTextboxes++;
        return constraints;
    }
    protected static GridBagConstraints constrainsForOutputComment(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,0,15);
        constraints.gridx=0;
        constraints.gridy=counterForTextboxes;
        counterForTextboxes++;
        return constraints;
    }
    protected static GridBagConstraints constraintsForFilename(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,0,15);
        constraints.gridx=0;
        constraints.gridy=18;
        return constraints;
    }
    protected static GridBagConstraints constrainsForOutputpanel(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,0,15);
        constraints.gridx=0;
        constraints.gridy=20;
        return constraints;
    }

    protected static GridBagConstraints constrainsForOutputStatus(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets.set(0, 15,10,15);
        constraints.gridx=0;
        constraints.gridy=19;
        return constraints;
    }


}
