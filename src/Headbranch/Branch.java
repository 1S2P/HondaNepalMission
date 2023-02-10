package Headbranch;

public class Branch {

    String branch_location;
    String branch_head;

    public Branch(String branch_location, String branch_head) {
        this.branch_location = branch_location;
        this.branch_head = branch_head;
    }

    public String getBranch_location() {
        return branch_location;
    }

    public void setBranch_location(String branch_location) {
        this.branch_location = branch_location;
    }

    public String getBranch_head() {
        return branch_head;
    }

    public void setBranch_head(String branch_head) {
        this.branch_head = branch_head;
    }
}