package Headbranch;

public class Department extends Branch{
    int department_id;
    int department_name;

    public Department(String branch_location, String branch_head) {
        super(branch_location, branch_head);
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(int department_name) {
        this.department_name = department_name;
    }
}