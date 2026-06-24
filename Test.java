class Demo {
    int a = 10;
    String s = "bharath";

    void show(int a, String s) {
        System.out.println(a + " " + s);
    }

}

class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(10, "bharath");
    }

}
