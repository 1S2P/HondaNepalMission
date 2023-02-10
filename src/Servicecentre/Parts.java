package Servicecentre;

public class Parts {
    Boolean brake;
    Boolean Tyre;
    Boolean Lights;
    Boolean Accelerator;

    public Parts(Boolean brake, Boolean tyre, Boolean lights, Boolean accelerator) {
        this.brake = brake;
        Tyre = tyre;
        Lights = lights;
        Accelerator = accelerator;
    }

    public Boolean getBrake() {
        return brake;
    }

    public void setBrake(Boolean brake) {
        this.brake = brake;
    }

    public Boolean getTyre() {
        return Tyre;
    }

    public void setTyre(Boolean tyre) {
        Tyre = tyre;
    }

    public Boolean getLights() {
        return Lights;
    }

    public void setLights(Boolean lights) {
        Lights = lights;
    }

    public Boolean getAccelerator() {
        return Accelerator;
    }

    public void setAccelerator(Boolean accelerator) {
        Accelerator = accelerator;
    }

}