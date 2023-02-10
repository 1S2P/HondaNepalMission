package Servicecentre;

public abstract class Services extends Parts {

    Boolean services;
    Boolean warranty;
    int branch_phone;
    Boolean mechanics;
    int time;
    private boolean name;

    public Services(Boolean brake, Boolean tyre, Boolean lights, Boolean accelerator, Boolean services, Boolean warranty) {
        super(brake, tyre, lights, accelerator);
        this.services = services;
        this.warranty = warranty;
        this.branch_phone = branch_phone;
        this.mechanics = mechanics;
        this.time = time;
    }

    public Boolean getServices() {
        return services;
    }

    public void setServices(Boolean services) {
        this.services = services;
    }

    public Boolean getWarranty() {
        return warranty;
    }

    public void setWarranty(Boolean warranty) {
        this.warranty = warranty;
    }

    public int getBranch_phone() {
        return branch_phone;
    }

    public void setBranch_phone(int branch_phone) {
        this.branch_phone = branch_phone;
    }

    public Boolean getMechanics() {
        return mechanics;
    }

    public void setMechanics(Boolean mechanics) {
        this.mechanics = mechanics;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }





}