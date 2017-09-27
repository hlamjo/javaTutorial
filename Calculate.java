public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Hello world");
        int first = Integer.valueOf(arg[1]);
        int second = Integer.valueOf(arg[2]);    
        
        switch(arg[0]){
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "m":
                System.out.println(first * second);
                break;
            case "d":
                System.out.println(first / second);
                break;
        }
    }
}