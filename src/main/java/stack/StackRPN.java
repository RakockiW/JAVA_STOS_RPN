package main.java.stack;

public class StackRPN extends Stack {
    
    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String calculate(String operator) {

        int firstVal = Integer.parseInt(pop());
        int secondVal = Integer.parseInt(pop());

        switch (operator) {
            case "+":
                return Integer.toString(Math.addExact(firstVal, secondVal));
            case "-":
                return Integer.toString(Math.subtractExact(firstVal, secondVal));
            case "*":
                return Integer.toString(Math.multiplyExact(firstVal, secondVal));
            case "/":
                return Integer.toString(secondVal / firstVal);
            default:
                return null;
        }
    }

    public String doOperation(String str) {

        String [] strArray = str.split(" ");

        for (int i=0; i < strArray.length; i++) {
            
            if (isNumeric(strArray[i])) {
                push(strArray[i]);
            } else {
                String operator = strArray[i];
                try {
                    push(calculate(operator));
                } catch (Exception e) {
                    return null;
                }
            }
        }
        
        return pop();
    }



}
