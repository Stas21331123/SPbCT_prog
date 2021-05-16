package Pr11_12_13.lang;

public class seven {
    public static class Test {
        public static void main(String[] args) {
            Test t = new Test();
            StringBuffer sb = new StringBuffer("aaa");
            System.out.println("Before = " + sb);
            t.doTest(sb);
            System.out.println("After = " + sb);
        }
        void doTest(StringBuffer theSb){
            theSb.append("-bbb");
        }
    }
}
