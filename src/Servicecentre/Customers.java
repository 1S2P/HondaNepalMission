package Servicecentre;

public class Customers extends Services {
    public static boolean c1;
    String name;
    String address;
    int phone_no;



    public Customers(Boolean brake, Boolean tyre, Boolean lights, Boolean accelerator, Boolean services, Boolean warranty, int branch_phone, Boolean mechanics, int time, String name, String address, int phone_no) {
        super(brake, tyre, lights, accelerator, services, warranty);
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    public static void info() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }




}