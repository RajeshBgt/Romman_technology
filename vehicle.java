

class vehicle {
    private String brand;
    private int year;
    private int price;


    public vehicle(String brand,int year,int price) {
        this.brand = brand;
        this.year =year;
        this.price =price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
            this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle[brand="+ brand+", year="+year +",price="+ price+"]";
    }
    public static void main(String[] args) {
        vehicle v1 =new vehicle("gt650", 2020, 450000);
       System.err.println( v1.toString());
    }
}

    
    
