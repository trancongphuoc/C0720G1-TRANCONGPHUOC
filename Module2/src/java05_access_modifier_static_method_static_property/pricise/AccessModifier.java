package java05_access_modifier_static_method_static_property.pricise;

public class AccessModifier {
    static class A {
        private int data = 40;

        private void msg() {
            System.out.println("Hello java");
        }
    }

    public static class Simple{

        public static void main(String args[]){

            A obj= new A();

            System.out.println(obj.data);//Compile Time Error

            obj.msg();//Compile Time Error

        }

    }


}